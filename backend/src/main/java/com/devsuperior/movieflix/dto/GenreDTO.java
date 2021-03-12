package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.devsuperior.movieflix.entities.Genre;

public class GenreDTO implements Serializable {

	// Attributes
	private static final long serialVersionUID = 1L;
	private Long id;
	
	@NotBlank(message = "Campo obrigatório!")
	private String name;


	// Constructors
	public GenreDTO() {

	}

	public GenreDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public GenreDTO(Genre entity) {

		id = entity.getId();
		name = entity.getName();
	}
	
	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
