package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esteban.demo.models.Song;

@Repository // Assigns the interface as repository
public interface SongRepository extends CrudRepository<Song, Long>{
	
	@Override
	List<Song> findAll();
	
	List<Song> findByArtist(String artist);
	
	List<Song> findTop10ByOrderByRatingDesc();
}

