package com.qa.springbootproject.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.springbootproject.Entities.Movies;

public interface MovieRepo  extends JpaRepository<Movies,Integer>{

	public List<Movies> findByName(String name);
}
