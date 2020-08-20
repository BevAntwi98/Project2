package com.qa.springbootproject.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.qa.springbootproject.Controllers.VideoGameController;
import com.qa.springbootproject.Entities.Anime;
import com.qa.springbootproject.Entities.VideoGames;
import com.qa.springbootproject.Repos.VideoGameRepo;
import com.qa.springbootproject.Services.AnimeServices;
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
	private int id;
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
	    verify(mockedGame, times(1)).getYearofrelease();
	    verify(mockedGame, times(1)).getRating();
	    verify(mockedGame, times(1)).getNotes();
	}
	
	@Test
	public void test2() {
		
		VideoGameServices mock = mock(VideoGameServices.class);
		
		Optional<VideoGames> a = Optional.ofNullable(new VideoGames(1, "Last of Us 1",2014, 8.9,"well made"));
		Optional<VideoGames> b = Optional.ofNullable(new VideoGames(1, "Last of Us 2",2020, 8.9,"RIP JOEL"));
		
//		when(mock.read(id)).thenReturn(a).thenReturn(b);
		when(mock.readAllEntries()).thenReturn(list);

		assertEquals(1,a.equals(1));
		assertEquals(2,b.equals(2));
			
	}
	
	@Test
	public void test3() {

		VideoGameServices mock = mock(VideoGameServices.class);
		VideoGames a = new VideoGames(1, "forgot", 5,2007,"long winded game");
		VideoGames b = new VideoGames(2, "forgot", 5,2009,"another long winded game");
		
		when(mock.deleteRecord(id)).thenReturn(gamess);
		
		a.setGameID(1);
		a.setName("forgot");
		a.setYearofrelease(2007);
		a.setRating(5);
		a.setNotes("long winded game");
		
		b.setGameID(2);
		b.setName("forgot");
		b.setYearofrelease(2009);
		b.setRating(5);
		b.setNotes("another long winded game");
		
		verify(mock, never()).deleteRecord(1);
		verify(mock, never()).deleteRecord(2);

	}
	@Test
	public void test4() {
		
		VideoGameServices mock = mock(VideoGameServices.class);
		VideoGames a = new VideoGames(1, "forgot", 5,2007,"long winded game");
		when(mock.readAllEntries()).thenReturn(list);
		a.getGameID();
		a.getName();
		a.getYearofrelease();
		a.getRating();
		a.getNotes();
		
//		verify(mock.readAllEntries().add(mockedGame));
		
	}
	
}
