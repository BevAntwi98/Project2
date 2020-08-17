package com.qa.springbootproject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VideoGames {

	@Id
	@GeneratedValue
	private int gameID;
	private String name;
	private int yearofrelease; 
	private double rating; 
	private String notes;
	
	public VideoGames() {
		super();
	}

	public VideoGames(int gameID, String name, int yearOfRelease, double rating, String notes) {
		super();
		this.gameID = gameID;
		this.name = name;
		this.yearofrelease = yearOfRelease;
		this.rating = rating;
		this.notes = notes;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getYearofrelease() {
		return yearofrelease;
	}

	public void setYearofrelease(int yearofrelease) {
		this.yearofrelease = yearofrelease;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
