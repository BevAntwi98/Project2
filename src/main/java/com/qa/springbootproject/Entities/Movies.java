package com.qa.springbootproject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movies {

	@Id
	@GeneratedValue
	private int moviesID;

	@Column
	private String name;

	@Column
	private String genre;

	@Column
	private double rating;

	@Column
	private boolean completed;

	@Column
	private String notes;

	public Movies() {
		super();
	}

	public Movies(int moviesID, String name, String genre, double rating, boolean completed, String notes) {
		super();
		this.moviesID = moviesID;
		this.name = name;
		this.genre = genre;
		this.rating = rating;
		this.completed = completed;
		this.notes = notes;
	}

	public int getMoviesID() {
		return moviesID;
	}

	public void setMoviesID(int moviesID) {
		this.moviesID = moviesID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
