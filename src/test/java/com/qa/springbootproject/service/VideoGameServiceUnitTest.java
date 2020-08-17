package com.qa.springbootproject.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
public class VideoGameServiceUnitTest {

	@MockBean
	VideoGameRepo repo;
	
	@Autowired
	VideoGameServices service;
	
	private VideoGames game;
	private Optional <VideoGames> optionalGame;
	int id=(int) 1;
	
	@Test
	public void testCreate() {
		VideoGames game= new VideoGames(1, "Ghost of Tsushima", 2020, 9.7, "WARNING: THIS GAME IS LONGGGGG");
		when(repo.save(game)).thenReturn(game);
		
		assertEquals(service.create(game), game);
		
		verify(repo, Mockito.times(1)).save(game);
	}
	
	@Test
	public void testRead() {
		game = new VideoGames(2,"Ni No Kuni 2", 2018,8.3, "Regretted buying this at first but it became a lot more enjoyable, just gotta pace through it and get used to the battle system! But a nicely paced game with cute chibi moments >^-^<");
		optionalGame=Optional.ofNullable(game);
		when(repo.findById(id)).thenReturn(optionalGame);
		
		assertEquals(service.read(id), game);
		
//	@Test
//	public void testDelete() {
//		game = new VideoGames(3, "KH3", 2018, 12.0, "Worth the wait! Should have made hard mode harder from the beginning tho. Only downside are the cutscenes. Too many and they were also loooong...otherwise everything perfect");
//	    when(repo.deleteById(id)).
//	    
//	    assertEquals(service.deleteRecord(id), game);
//		
//	}
		
	}
	
}
