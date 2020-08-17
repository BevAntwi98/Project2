package com.qa.springbootproject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springbootproject.Entities.Anime;
import com.qa.springbootproject.Services.AnimeServices;

@RestController
@RequestMapping("/anime")
public class AnimeController {
	
	@Autowired
	AnimeServices service;

	@PostMapping("/create")
		public String animeCreate(@RequestBody Anime anime) {
			return service.createAnimeEntry(anime);
		}
	
	@GetMapping("/read/{name}")
	public  List<Anime> animeRead(@PathVariable ("name") String name) {
		return service.animeList(name);
		
	}
	@GetMapping("/showAll")
	public List<Anime> showAllEntries(@RequestBody Anime a){
		return service.readAllEntries();
	}
	
//	@PutMapping("/update/{anime}/{name}")
//	public String somethingforupdate() {
//	return "insertsomecode";
//
//	} 
	
	@DeleteMapping("/delete/{id}")
	public String animeDeleteById(@PathVariable ("id") int id) {
		return service.deleteAnimeById(id);
	}
}
