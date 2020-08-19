package com.qa.springbootproject.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.qa.springbootproject.Controllers.VideoGameController;
import com.qa.springbootproject.Entities.VideoGames;
import com.qa.springbootproject.Repos.VideoGameRepo;
import com.qa.springbootproject.Services.VideoGameServices;

@RunWith(MockitoJUnitRunner.class)
public class VideoGameServiceUnitTest {

	@Mock
	private VideoGameRepo repo;

	@Mock
	private VideoGameServices service;

	@InjectMocks
	private VideoGameController controller;

	private List<VideoGames> list;
	private VideoGames game;
	private VideoGames id;
	private String gamess;


	VideoGames mockedGame = mock(VideoGames.class);
	
//	@Before
//	public void init() {
//		this.list= new ArrayList();
//		
//	}
	
	@Test
	public void testCreate() {
		 VideoGames game = new VideoGames(1,"GTA", 2013, 10.0, "amazing");
         when(mockedGame.getGameID()).thenReturn(1);
         when(mockedGame.getName()).thenReturn("GTA");
         when(mockedGame.getYearofrelease()).thenReturn(2013);
         when(mockedGame.getRating()).thenReturn(10.0);
         when(mockedGame.getNotes()).thenReturn("amazing");
        				 
	    
//	    when(service.create(game)).thenReturn(gamess);
	    assertEquals(mockedGame.getGameID(),1);
	    assertEquals(mockedGame.getName(), "GTA");
	    assertEquals(mockedGame.getYearofrelease(), 2013);
	    assertEquals(mockedGame.getRating(), 10.0);
	    assertEquals(mockedGame.getNotes(), "amazing");
	    
	    verify(mockedGame, times(1)).getGameID();
	    verify(mockedGame, times(1)).getName();
	}
	
}
