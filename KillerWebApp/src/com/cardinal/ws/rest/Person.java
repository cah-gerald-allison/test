package com.cardinal.ws.rest;

import java.util.Date;

public class Person {

	private String firstName;
	private String lastName;
	
	private String favoriteMovie;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	public String getFavoriteMovie() {
		return favoriteMovie;
	}
	public void setFavoriteMovie(String favoriteMovie) {
		this.favoriteMovie = favoriteMovie;
	}
	
	
}
