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

import com.qa.springbootproject.Entities.Movies;
import com.qa.springbootproject.Repos.MovieRepo;
import com.qa.springbootproject.Services.MoviesServices;

@RunWith((SpringRunner.class))
@SpringBootTest
public class MovieServicesUnitTest {
	
	@MockBean
	MovieRepo repo;
	
	@Autowired
	MoviesServices service;
	
	private Movies movie;
	private List<Movies> list  ;
	private int id;
	private String name;
	private Optional <Movies> optionalMovie;
	
	
	@Test
	public void testCreate() {
		movie= new Movies(1, "Lion King", "kids film?",11.0, true, "family fav");
		when(repo.save(movie)).thenReturn(movie);
		assertEquals(service.createMovie(movie), movie);
		
		verify(repo, Mockito.times(1)).save(movie);
		}

	@Test
	public void testRead() {
		movie= new Movies(1, "Advent Children Complete", "fantasy",11.0, true, "the remake was slightly better");
		when(repo.findByName(name)).thenReturn(list);
		assertEquals(service.readByName(name), name);
		verify(repo, Mockito.times(1).description(name));
	}
	@Test
	public void testReadById() {
		movie= new Movies(1, "Advent Children Complete", "fantasy",11.0, true, "the remake was slightly better");
		optionalMovie= Optional.ofNullable(movie);
		when(repo.findById(id)).thenReturn(optionalMovie);
//		assertEquals(service.readById(id), movie);
//		verify(repo, Mockito.times(1).read(id));
	}
	@Test
	public void testShowAll() {
		movie= new Movies(1, "Advent Children Complete", "fantasy",11.0, true, "the remake was slightly better");
		when(repo.findAll()).thenReturn(list);
		assertEquals(service.readById(id), id);
		
	}
		
	}

