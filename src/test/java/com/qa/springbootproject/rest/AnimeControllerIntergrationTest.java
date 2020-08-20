package com.qa.springbootproject.rest;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.springbootproject.Controllers.AnimeController;
import com.qa.springbootproject.Entities.Anime;
import com.qa.springbootproject.Services.AnimeServices;

@RunWith((SpringRunner.class))
@SpringBootTest
public class AnimeControllerIntergrationTest {
	
	@MockBean
	AnimeServices service;
	
	@Autowired
	AnimeController c;
	
	
	private Anime anime;
	private List<Anime> list;
	private String name;
	private Optional<Anime> optionalAnime;
	int id;
	 
	@Test
	public void createC(){
	anime = new Anime(1, "HxH", 10.0, true, "Top ten but it aint ten..or one");
	when(service.createAnimeEntry(anime)).thenReturn(name);
		
		
	}
}
