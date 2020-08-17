package com.qa.springbootproject.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springbootproject.Entities.Anime;
import com.qa.springbootproject.Repos.AnimeRepo;

@Service
public class AnimeServices {

	@Autowired
	AnimeRepo repo;

	// create entry
	public String createAnimeEntry(Anime a) {
		repo.save(a);
		return " Anime info saved";
	}

	// find anime info by name
	public List<Anime> animeList(String name) {

		return repo.findByname(name);

	}

	// listallrecords
	public List<Anime> readAllEntries() {
		return repo.findAll();

	}

//	public Anime animeUpdate(Anime newAnime, String name) {// updates by finding the id of game
//
//		Anime find = List<Anime>(name);
//
//		find.setAnimeName(newAnime.getAnimeName());
//		find.setRating(newAnime.getRating());
//		find.setCompleted(newAnime.isCompleted());
//		find.setNotes(newAnime.getNotes());
//
//		Anime save = repo.save(find);
//		return save;
//	}

// delete by id
	public String deleteAnimeById(int id) {
		repo.deleteById(id);
		return "ID:" + id + " deleted!";
	}

}
