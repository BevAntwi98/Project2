package com.qa.springbootproject.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springbootproject.Entities.Anime;

@Repository
public interface AnimeRepo extends JpaRepository<Anime,Integer> {
	
	public List<Anime> findByname(String name);

}
