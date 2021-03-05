package com.devsuperior.movieflix.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.UserRepository;
import com.devsuperior.movieflix.services.exceptions.ForbiddenException;
import com.devsuperior.movieflix.services.exceptions.UnauthorizedException;

@Service
public class AuthService implements Serializable {
	
	//Attributes
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserRepository userRepository;

	//Methods
	@Transactional(readOnly = true)
	public User authenticated() {

		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
		} catch (Exception e) {

			throw new UnauthorizedException(e.getMessage() + " :Unauthorized");
		}

	}

	public void validateSelfOrAdmin(Long userId) {

		User user = authenticated();
		if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) {
			throw new ForbiddenException("Access denied");
		}

	}

}
