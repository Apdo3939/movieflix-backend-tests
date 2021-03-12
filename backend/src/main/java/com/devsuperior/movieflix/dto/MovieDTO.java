package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;

import com.devsuperior.movieflix.entities.Movie;

public class MovieDTO implements Serializable {

	// Attributes
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank(message = "Campo Obrigatório!")
	private String title;

	@NotBlank(message = "Campo Obrigatório!")
	private String subTitle;

	private Integer year;
	private String imgUrl;
	
	@NotBlank(message = "Campo Obrigatório!")
	private String synopsis;
	
	private Long genreId;
	
	private Set<ReviewDTO> reviews = new HashSet<>();
	

	// Constructors
	public MovieDTO() {

	}

	public MovieDTO(Long id, String title, String subTitle, Integer year, String imgUrl, String synopsis, Long genreId) {
		super();
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.genreId = genreId;
	}

	public MovieDTO(Movie entity) {

		id = entity.getId();
		title = entity.getSubTitle();
		subTitle = entity.getSubTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		synopsis = entity.getSynopsis();
		genreId = entity.getGenre().getId();
		entity.getReviews().forEach(review -> this.reviews.add( new ReviewDTO(review)));
	}
	
	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	public Set<ReviewDTO> getReviews() {
		return reviews;
	}

}
