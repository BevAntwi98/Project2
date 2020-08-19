package com.qa.springbootproject.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
	private Anime id;
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

}
