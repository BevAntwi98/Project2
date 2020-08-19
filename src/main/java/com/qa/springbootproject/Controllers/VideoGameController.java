package com.qa.springbootproject.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springbootproject.Entities.VideoGames;
import com.qa.springbootproject.Services.VideoGameServices;

@RestController
@RequestMapping("/game")
@CrossOrigin
public class VideoGameController {

	
	private VideoGameServices service;

	public VideoGameController(VideoGameServices service) { // Dependency injection to reduce coupling
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public String VideoGameCreate(@RequestBody VideoGames game) {
		System.out.println(game);
		this.service.create(game);
		return "Game info saved!";
	}

	@GetMapping("/showAll")
	public List<VideoGames> readAll() {
		List<VideoGames> records = service.readAllEntries();

		return records;
	}

	@GetMapping("read/{id}")
	public String findById(@PathVariable int id) {
		this.service.read(id);
		return id + " has been found for you!";
	}

//	public String update(@RequestBody VideoGames newGame, @PathVariable("id") int id) {
//		this.service.update(newGame, id);
//		return "Game info updated!";
//	}

	@GetMapping("/save")
	public String saveGameRecord() {

		VideoGames game = new VideoGames();
		game.setGameID(1);
		game.setName("God Of War 4");
		game.setYearofrelease(2018);
		game.setRating(9.6);
		game.setNotes("amazing game, definitely deserved game of the year! If you haven't played this"
				+ " masterpiece already then I highly recommend");

		this.service.create(game);
		return "Game information saved!";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteGameRecord(@PathVariable("id") int id) {
		String msg = this.service.deleteRecord(id);
		return msg;

	}

	@GetMapping("/maxrating")
	public int maxrating() {
		return service.findByRating();
	}
}
