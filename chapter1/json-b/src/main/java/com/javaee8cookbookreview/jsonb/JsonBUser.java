package com.javaee8cookbookreview.jsonb;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class JsonBUser {

	public static void main(String[] args) throws Exception {
		User user = new User("Elder", "elder@eldermoraes.com");
		Jsonb jb = JsonbBuilder.create();
		String jsonUser = jb.toJson(user);
		User u = jb.fromJson(jsonUser, User.class);
		jb.close();
		System.out.println("json: " + jsonUser);
		System.out.println("user: " + u);
	}
}
