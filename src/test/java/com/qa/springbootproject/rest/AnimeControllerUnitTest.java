package com.qa.springbootproject.rest;

import java.util.List;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.springbootproject.Controllers.AnimeController;
import com.qa.springbootproject.Entities.Anime;
import com.qa.springbootproject.Services.VideoGameServices;

@RunWith(MockitoJUnitRunner.class)
public class AnimeControllerUnitTest {
	

	@Mock
	private VideoGameServices service;

	@InjectMocks
	private AnimeController controller;

	private List<Anime> list;
	private Anime game;
	private int id;



}
