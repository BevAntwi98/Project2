package com.qa.springbootproject.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springbootproject.Entities.Movies;
import com.qa.springbootproject.Repos.MovieRepo;

@Service
public class MoviesServices {
	
	@Autowired
	MovieRepo repo;
	
	
	
	// create
	public String createMovie(Movies movies) {
		repo.save(movies);
		return "Movie saved!";

	}

	// read
	public Optional<Movies> readById(int id) {
		return repo.findById(id);
	}

	public List<Movies> readbyid(Iterable<Integer> ids){
		return repo.findAllById(ids);
	}
	// readbyname
	public List<Movies> readByName(String name) {
		return repo.findByName(name);
	}

	// readAll
	public List<Movies> readAllEntries() {
		return repo.findAll();
	}

//	//update
//	public String updateMovie() 

	// delete
	public String deleteMovie(int id) {
		repo.deleteById(id);
		return 	"ID no. :" + id + "deleted!";

	}

}
