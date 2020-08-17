package com.qa.springbootproject.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springbootproject.Entities.Movies;
import com.qa.springbootproject.Services.MoviesServices;

@RestController
@RequestMapping("/movie")
public class MoviesController {

	private MoviesServices service;

	public MoviesController(MoviesServices service) {
		super();
		this.service = service;

	}

	// create
	@PostMapping("/create")
	public String createMovie(Movies movie) {
		service.createMovie(movie);
		return "Movie info saved!";
	}

	@GetMapping("/save")
	public String saveMovie() {

		Movies movie = new Movies();
		movie.setName("The Limoney Snicket one");
		movie.setGenre("Comedy?");
		movie.setRating(7.0);
		movie.setCompleted(true);
		movie.setNotes("Good film if a bit long winded. I still wonder to this day who the narrator is");

		service.createMovie(movie);

		return "Movie info saved!";
	}

	@GetMapping("/read/{name}")
	public List<Movies> readByName(String name) {
		return service.readByName(name);
	}

	@GetMapping("find/{id}")
	public Optional<Movies> readById(int id) {
		return service.readById(id);
	}

	@GetMapping("/showAll")
	public List<Movies> showAll() {
		return service.readAllEntries();

	}
	// update

	@DeleteMapping("delete/{id}")
	public String deleteMovie(int id) {
		service.deleteMovie(id);
		return "ID no." + id + " deleted!";
	}

}
