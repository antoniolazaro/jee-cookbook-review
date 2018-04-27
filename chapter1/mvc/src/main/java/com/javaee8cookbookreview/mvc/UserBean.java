package com.javaee8cookbookreview.mvc;

import javax.ejb.Stateless;

@Stateless
public class UserBean {
	
	public User getUser() {
		return new User("Elder", "elder@eldermoraes.com");
	}
}
