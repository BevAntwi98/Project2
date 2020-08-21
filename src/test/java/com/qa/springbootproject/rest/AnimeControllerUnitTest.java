package com.qa.springbootproject.rest;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
=======
import java.util.List;

>>>>>>> a3415adb0cbe8c5c1562c8aafff0acf26d641207
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
<<<<<<< HEAD
import com.qa.springbootproject.Controllers.AnimeController;
import com.qa.springbootproject.Entities.Anime;
import com.qa.springbootproject.Services.AnimeServices;
=======

import com.qa.springbootproject.Controllers.AnimeController;
import com.qa.springbootproject.Entities.Anime;
import com.qa.springbootproject.Services.VideoGameServices;
>>>>>>> a3415adb0cbe8c5c1562c8aafff0acf26d641207

@RunWith(MockitoJUnitRunner.class)
public class AnimeControllerUnitTest {
	
<<<<<<< HEAD
	@InjectMocks
	private AnimeController controller;

	@Mock
	private AnimeServices service;

	private List<Anime> list;
	private Anime anime;
	private String save;
	int id;

   
=======

	@Mock
	private VideoGameServices service;

	@InjectMocks
	private AnimeController controller;

	private List<Anime> list;
	private Anime game;
	private int id;


>>>>>>> a3415adb0cbe8c5c1562c8aafff0acf26d641207

}
