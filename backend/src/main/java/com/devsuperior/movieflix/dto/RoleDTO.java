package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.Set;

import com.devsuperior.movieflix.entities.Role;
import com.devsuperior.movieflix.entities.User;

public class RoleDTO implements Serializable {

	// Attributes
	private static final long serialVersionUID = 1L;
	private Long id;
	private String authority;
	

	// Constructors
	public RoleDTO() {

	}

	public RoleDTO(Long id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}

	public RoleDTO(Role entity) {
		super();
		this.id = entity.getId();
		this.authority = entity.getAuthority();

	}

	public RoleDTO(Role entity, Set<User> users) {
		this(entity);

	}

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
