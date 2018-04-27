package com.javaee8cookbookreview.jsf23;


import java.io.Serializable;

import javax.validation.constraints.Email;

public class User implements Serializable{

	 private String name;
	 @Email
     private String email;
     
     public User(String name, String email) {
         this.name = name;
         this.email = email;
     }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
