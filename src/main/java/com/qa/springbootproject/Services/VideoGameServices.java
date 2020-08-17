package com.qa.springbootproject.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springbootproject.Entities.VideoGames;
import com.qa.springbootproject.Repos.VideoGameRepo;

@Service
public class VideoGameServices {

	@Autowired
	VideoGameRepo vgrepo;

	public VideoGameServices(VideoGameRepo vgrepo) {
		super();
		this.vgrepo = vgrepo;
	}

	public String create(VideoGames videogame) { // create method

		VideoGames save = this.vgrepo.save(videogame);
		return "Entry saved!";
	}

	public Optional<VideoGames> read(int id) { // read all game info by id

		return this.vgrepo.findById(id);

	}

	public List<VideoGames> readAllEntries() { // shows all entries made
		return vgrepo.findAll();
	}

//	public VideoGames update(VideoGames newGame, int id) { // updates by finding the id of game
//
//		Optional<VideoGames> find = read(id);
//		find.setName(newGame.getName());
//		find.setYearofrelease(newGame.getYearofrelease());
//		find.setRating(newGame.getRating());
//		find.setNotes(newGame.getNotes());
//
//		VideoGames save = this.vgrepo.save(find);
//		return save;
//	}

	public String deleteRecord(int id) { // deletes by id and also prints a message if the id exists or not
		String message = "";
		Optional<VideoGames> record = vgrepo.findById(id);
		if (record.isPresent()) {
			vgrepo.deleteById(id);
			message = "Record " + id + " has been deleted";
		} else {
			message = "The id " + id + " does not exist!!";
		}
		return message;
	}

	public int findByRating() { // finds the game with the highest rating
		return vgrepo.maxrating();

	}

}
