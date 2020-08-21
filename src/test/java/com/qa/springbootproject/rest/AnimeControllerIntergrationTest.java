package com.qa.springbootproject.rest;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
=======
import static org.mockito.Mockito.when;

>>>>>>> a3415adb0cbe8c5c1562c8aafff0acf26d641207
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
<<<<<<< HEAD

import com.qa.springbootproject.Controllers.AnimeController;
import com.qa.springbootproject.Entities.Anime;
import com.qa.springbootproject.Repos.AnimeRepo;
import com.qa.springbootproject.Services.AnimeServices;

@RunWith((SpringRunner.class))
@SpringBootTest
public class AnimeControllerIntergrationTest {
	
	@MockBean
	AnimeServices service;
	
	@MockBean
	AnimeRepo repo;
	
	@Autowired
	AnimeController c;
	
	
	private Anime anime;
	private List<Anime> list;
	private String save;
	private String name;
	private Optional<Anime> optionalAnime;
	int id;
	 
	@Test
	public void createTest() {
		Anime a= new Anime(1, "Watamote", 9.7, true,"v funny");
		when(service.createAnimeEntry(anime)).thenReturn(save);
//		assertEquals(c.animeCreate(a),a);
//		verify(this.service, times(1)).createAnimeEntry(anime);
	}
	
	@Test
	public void deleteTest() {
		this.c.animeDeleteById(id);

		verify(this.service, times(1)).deleteAnimeById(id);
	}
	@Test
	public void readAllTest() {
		
		Anime a= new Anime(1, "Watamote", 9.7, true,"v funny");
		Anime b= new Anime(2, "Watamote", 9.7, true,"v funny");
	   when(service.readAllEntries()).thenReturn(list);
//	   assertEquals(c.showAllEntries(),a);
//	   assertEquals(c.showAllEntries(),b);
	}
	@Test
	public void readNameTest() {
		when(service.animeList(name)).thenReturn(list);
	}
		

}
=======

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
>>>>>>> a3415adb0cbe8c5c1562c8aafff0acf26d641207
