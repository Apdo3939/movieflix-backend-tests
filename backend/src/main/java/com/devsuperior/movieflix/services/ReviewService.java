package com.devsuperior.movieflix.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class ReviewService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ReviewRepository repository;
	
	@Autowired AuthService authService;
	
	@Autowired
	private MovieRepository movieRepository;

	@Transactional(readOnly = true)
	public List<ReviewDTO> findAll() {
		List<Review> list = repository.findAll();
		return list.stream().map(x -> new ReviewDTO(x)).collect(Collectors.toList());
	}

	
	@Transactional(readOnly = true)
	public ReviewDTO findById(Long id) {
		Optional<Review> obj = repository.findById(id);
		Review entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ReviewDTO(entity);
	}
	
	@Transactional
	public ReviewDTO insert(ReviewDTO dto) {
		User user = authService.authenticated();
		Review entity = new Review();
		entity.setText(dto.getText());
		entity.setUser(user);
		
		//É possivel que seja problema de autenticação! Pois o teste sem ser autenticado esta passando!!!
		Movie movie = movieRepository.getOne(dto.getMovieId());
		entity.setMovie(movie);
		//********************************
		
		
		entity = repository.save(entity);
		return new ReviewDTO(entity);
	}

}
