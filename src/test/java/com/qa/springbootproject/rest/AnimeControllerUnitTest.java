package com.qa.springbootproject.rest;

import static org.junit.Assert.assertEquals;
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
import com.qa.springbootproject.Services.AnimeServices;

@RunWith(MockitoJUnitRunner.class)
public class AnimeControllerUnitTest {
	
	@InjectMocks
	private AnimeController controller;

	@Mock
	private AnimeServices service;

	private List<Anime> list;
	private Anime anime;
	private String save;
	int id;

	@Test
	public void createTest() {
		Anime a= new Anime(1, "Watamote", 9.7, true,"v funny");
		when(service.createAnimeEntry(anime)).thenReturn(save);
		assertEquals(controller.animeCreate(a),a);
		verify(this.service, times(1)).createAnimeEntry(anime);
	}
	
	@Test
	public void deleteTest() {
		this.controller.animeDeleteById(id);

		verify(this.service, times(1)).deleteAnimeById(id);
	}


}
