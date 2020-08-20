package com.qa.springbootproject.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.qa.springbootproject.Controllers.AnimeController;

import com.qa.springbootproject.Entities.Anime;

import com.qa.springbootproject.Repos.AnimeRepo;

import com.qa.springbootproject.Services.AnimeServices;

@RunWith(MockitoJUnitRunner.class)
public class AnimeServiceUnitTest {

	@Mock
	private AnimeRepo repo;

	@Mock
	private AnimeServices service;

	@InjectMocks
	private AnimeController controller;

	private List<Anime> list;
	private Anime game;
	private int id;
	private String anime;

	Anime mockedAnime = mock(Anime.class);

	@Test
	public void testCreate() {
		Anime anime = new Anime(1, "Game", 10.0, true, "amazing");
		when(mockedAnime.getAnimeID()).thenReturn(1);
		when(mockedAnime.getName()).thenReturn("Game");
		when(mockedAnime.getRating()).thenReturn(10.0);
		when(mockedAnime.isCompleted()).thenReturn(true);
		when(mockedAnime.getNotes()).thenReturn("amazing");


		assertEquals(mockedAnime.getAnimeID(), 1);
		assertEquals(mockedAnime.getName(), "Game");
		assertEquals(mockedAnime.getRating(), 10.0);
		assertEquals(mockedAnime.isCompleted(), true);
		assertEquals(mockedAnime.getNotes(), "amazing");

		verify(mockedAnime, times(1)).getAnimeID();
	}
	
	@Test
	public void test2() {
		
		AnimeServices mock = mock(AnimeServices.class);
		
		Anime a = new Anime(1, "abc", 3,false,"strange");
		Anime b = new Anime(2, "Re Zero", 10.0, true, "addictive");
		
		when(mock.readAllEntries()).thenReturn(list);

		assertEquals(1,a.equals(a));
		assertEquals(2,b.equals(b));
			
	}
	
	@Test
	public void test3() {

		AnimeServices mock = mock(AnimeServices.class);
		Anime a = new Anime(1, "abc", 3,false,"strange");
		
		when(mock.deleteAnimeById(id)).thenReturn(anime);
		Anime b = new Anime(2, "Re Zero", 10.0, true, "addictive");
		a.setAnimeID(1);
		b.setAnimeID(2);
		
		verify(mock, never()).deleteAnimeById(1);
		verify(mock, never()).deleteAnimeById(2);

	}
	@Test
	public void test4() {
		
		AnimeServices mock = mock(AnimeServices.class);
		Anime a = new Anime(1, "abc", 3,false,"strange");
		when(mock.readAllEntries()).thenReturn(list);
		a.getAnimeID();
		a.getName();
		a.getRating();
		a.isCompleted();
		a.getNotes();
		
		verify(mock.animeList(anime));
		
	}


}
