package com.qa.springbootproject.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.springbootproject.Entities.Anime;
import com.qa.springbootproject.Repos.AnimeRepo;
import com.qa.springbootproject.Services.AnimeServices;

@RunWith((SpringRunner.class))
@SpringBootTest
public class AnimeServiceUnitTest {
	
	@MockBean
	AnimeRepo repo;
	
	@Autowired
	AnimeServices service;
	
	private Anime anime;
	private List<Anime> name;
	private String name1;
	private int id;
	
	
	@Test
	public void testCreate() {
		anime = new Anime(1, "HxH", 10.0, true, "Top ten but it aint ten (ngl its not one either)");
		when(repo.save(anime)).thenReturn(anime);
		
		assertEquals(service.createAnimeEntry(anime),anime);
		
		verify(repo, Mockito.times(1)).save(anime);
	}
	@Test
	public void testRead() {
		anime = new Anime(1,"Samurai Champloo", 11.0, true, "A truly underrated classic. If you've always wanted to watch some samurai fight with jazzy music in the background then this is for you");
		when(repo.findByname(name1)).thenReturn(name);
		
		assertEquals(service.animeList(name1),name1);
		verify (repo, Mockito.times(1).description(name1));
	}
		
	@Test
	public void testReadAll() {
		anime = new Anime (1,"7 Deadly Sinzz",4.3,false, "didnt enjoy it really. maybe got to episode 6? before i got bored. its supposed to be good tho so might have to try again");
		anime = new Anime (2, " Maid Sama or something", 6.6, false, "Wasnt bad but overly cringy. Made for simps prolli");
		
		when(repo.findAll()).thenReturn(null);
		assertEquals(service.readAllEntries());
		
	}
	@Test
	public void testDelete() {
		anime = new Anime (2, " ", 8, false, "");
		when(repo.deleteById(id)).thenReturn(id);
	    assertEquals(service.deleteAnimeById(id),id);
	    
//	    verify(repo, Mockito.times(1).)
		
	}
	
	}


