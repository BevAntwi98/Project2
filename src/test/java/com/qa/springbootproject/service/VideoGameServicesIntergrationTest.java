package com.qa.springbootproject.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.qa.springbootproject.Entities.VideoGames;
import com.qa.springbootproject.Repos.VideoGameRepo;
import com.qa.springbootproject.Services.VideoGameServices;

@RunWith((SpringRunner.class))
@SpringBootTest
public class VideoGameServicesIntergrationTest {
	

	@MockBean
	VideoGameRepo repo;
	
	@Autowired
	VideoGameServices service;
	
	private List<VideoGames> games;
	private VideoGames game;
	private Optional <VideoGames> optionalGame;
	int r;
	int id=(int) 1;
	
	@Test
	public void testCreate() {
		VideoGames game= new VideoGames(1, "Ghost of Tsushima", 2020, 9.7, "WARNING: THIS GAME IS LONGGGGG");
		when(repo.save(game)).thenReturn(game);
		
		assertEquals(service.create(game), game);
		
	}
	
	@Test
	public void testRead() {
		game = new VideoGames(2,"Ni No Kuni 2", 2018,8.3, "Regretted buying this at first but it became a lot more enjoyable. cute chibi moments >^-^<");
		optionalGame=Optional.ofNullable(game);
		when(repo.findById(id)).thenReturn(optionalGame);
		
		assertEquals(service.read(id), id);
	}
	@Test
	public void testReadAll() {
		List <VideoGames> games= new ArrayList();
		game = new VideoGames(2,"FF7", 2020, 9.5,"too long");
		game= new VideoGames(3,"KH",2019, 10.0,"too many cutscenes");
		when(repo.findAll()).thenReturn(games);
	}
	@Test
	public void testRating() {
		List <VideoGames> games= new ArrayList();
		game = new VideoGames(2,"something", 2020, 9.5,"too long");
		game= new VideoGames(3,"somethingelse",2019, 10.0,"too many cutscenes");
		when(repo.findByRatingGreaterThan(r)).thenReturn(games);
		assertEquals(service.findByRating(), r);
		
	}
	@Test
	public void testDelete() {
		game = new VideoGames(2,"GTA Vice City", 2001, 7,"never finished");
		optionalGame=Optional.ofNullable(game);
		when(repo.existsById(id)).thenReturn(true);
		assertEquals(service.deleteRecord(id), id);
		
		
	}

}
