package com.javaee8cookbookreview.beanvalidation2;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

public class User {

	@NotBlank
	private String name;

	@Email
	private String email;

	@NotEmpty
	private List<@PositiveOrZero Integer> profileId;

	public User(String name, String email, List<Integer> profileId) {
		super();
		this.name = name;
		this.email = email;
		this.profileId = profileId;
	}
	
	

}
