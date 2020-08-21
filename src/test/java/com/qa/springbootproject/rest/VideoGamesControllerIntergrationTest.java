package com.qa.springbootproject.rest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.springbootproject.Controllers.VideoGameController;
import com.qa.springbootproject.Entities.VideoGames;
import com.qa.springbootproject.Repos.VideoGameRepo;
import com.qa.springbootproject.Services.VideoGameServices;



@RunWith((SpringRunner.class))
@SpringBootTest
public class VideoGamesControllerIntergrationTest {

	@MockBean
	VideoGameServices service;
	
	@MockBean
	VideoGameRepo repo;
	
	@Autowired
	VideoGameController c;
	
	
	private VideoGames game;
	private List<VideoGames> list;
	private String save;
	private String name;
	private Optional<VideoGames> optionalGame;
	int id;
	int r;
	String msg = "Game information Saved!";
	 
	@Test
	public void createTest() {
		VideoGames game= new VideoGames(1, "ABC",2017, 9.9,"short but sweet");
		when(service.create(game)).thenReturn(save);
//		assertEquals(c.animeCreate(a),a);
//		verify(this.service, times(1)).createAnimeEntry(anime);
	}
	@Test
	public void deleteTest() {
		VideoGames game= new VideoGames(1, "ABC",2017, 9.9,"short but sweet");
		c.deleteGameRecord(id);

		verify(this.service, times(1)).deleteRecord(id);
	}
	@Test
	public void readTest() {
		when(service.read(id)).thenReturn(optionalGame);
		verify(c.findById(id), times(1));
	}
	@Test
	public void readAllTest() {
		VideoGames game= new VideoGames(1, "ABC",2017, 9.9,"short but sweet");
		VideoGames game2= new VideoGames(2, "ABC",2017, 9.9,"decent");
		
		when(service.readAllEntries()).thenReturn(list);
//		verify(c.readAll()).containsAll(list);
	}
	@Test
	public void saveTest() {
		
		VideoGames game= new VideoGames(1, "ABC",2017, 9.9,"short but sweet");
		game.setGameID(1);
		game.setName("ABC");
		game.setYearofrelease(2017);
		game.setRating(9.9);
		game.setNotes("short but sweet");
		when(service.create(game)).thenReturn(msg);
	}
	@Test
	public void maxRatingTest() {
		when(service.findByRating()).thenReturn(r);
	}
}
