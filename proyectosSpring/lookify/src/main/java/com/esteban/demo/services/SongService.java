package com.esteban.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esteban.demo.models.Song;
import com.esteban.demo.repositories.SongRepository;

@Service
public class SongService {
	
	private final SongRepository songRepo;
	
	public SongService(SongRepository songRepo) {
		this.songRepo = songRepo;
	}
	
	//Devolviendo todas las canciones.
	public List<Song> allSongs(){
		return songRepo.findAll();
	}
	
	//Creando cancion
	public Song createSong(Song song) {
		return songRepo.save(song);
	}
	
	//Obteniendo la información de una cancion
	public Song findSong(Long id) {
		Optional<Song> optionalSong = songRepo.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		} else {
			return null;
		}
	}
	
	//Borrar cancion
	public void deleteSong(Long id) {
			songRepo.deleteById(id);
	}
	
	//top canciones
	
	public List<Song> getTopTen(){
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	
	//buscar artista
	
	public List<Song> getSearchSongs(String artist){
		return songRepo.findByArtist(artist);
	}
	
}