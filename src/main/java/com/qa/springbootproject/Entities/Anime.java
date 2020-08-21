package com.qa.springbootproject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anime")
public class Anime {
	
	@Id
	@GeneratedValue
	private int animeID;
	
	@Column 
	private String name;
	
	@Column
	private double rating;
	
	@Column 
	private boolean completed;
	
	@Column
	private String notes;
	
	
	public Anime() {
		super();
	}
	
	
	public Anime(int animeID, String name, double rating, boolean completed, String notes) {
		super();
		this.animeID = animeID;
		this.name = name;
		this.rating = rating;
		this.completed = completed;
		this.notes = notes;
	}
	public int getAnimeID() {
		return animeID;
	}
	public void setAnimeID(int animeID) {
		this.animeID = animeID;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
