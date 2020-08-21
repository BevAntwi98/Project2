package com.qa.springbootproject.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.springbootproject.Entities.VideoGames;

@Repository
public interface VideoGameRepo extends JpaRepository<VideoGames,Integer> {

	public List<VideoGames> findByName(String name);
	public List<VideoGames> findByRatingGreaterThan(int r);
	public List<VideoGames> findByYearofrelease(int y);
	
	@Query(value ="SELECT max(rating) from videogames", nativeQuery=true)
	public int maxrating();
	
}

