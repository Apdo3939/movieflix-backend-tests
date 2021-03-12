package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO implements Serializable {

	// Attributes
	private static final long serialVersionUID = 1L;
	private Long id;
	private String text;

	private UserDTO user;

	private Long movieId;

	// Constructors
	public ReviewDTO() {

	}

	public ReviewDTO(Long id, String text, UserDTO user, Long movieId) {

		this.id = id;
		this.text = text;
		this.user = user;
		this.movieId = movieId;

	}

	public ReviewDTO(Review entity) {

		id = entity.getId();
		text = entity.getText();
		user = new UserDTO(entity.getUser());
		movieId = entity.getMovie().getId();
	}

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setMovieId(long id) {
		this.id = id;

	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

}
