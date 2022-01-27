package com.esteban.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.esteban.demo.models.Song;
import com.esteban.demo.services.SongService;

@Controller

public class controlador {

	private final SongService songService;
	
	public controlador(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String home() {
		return "/songs/index.jsp";
	}
	
	//mostrar todo en dashboard
	@RequestMapping(value="dashboard", method=RequestMethod.GET)
	public String index(Model model, @ModelAttribute("song")Song song) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "songs/dashboard.jsp";
	}
	
	//--------------------------------------------------------------------------
	
	//mostrar canciones
	@RequestMapping(value="songs/{id}", method=RequestMethod.GET)
	public String show(@PathVariable("id") Long id, Model model) {
		Song song = songService.findSong(id);
		model.addAttribute("song", song);
		return "/songs/show.jsp";
	}
	
	//--------------------------------------------------------------------------
	
	//crear cancion
	
	@RequestMapping("songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "songs/new.jsp";
	}
	
	@RequestMapping(value="/songs", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
	if (result.hasErrors()) {
		return "/songs/new.jsp";
	} else {
		songService.createSong(song);
		return "redirect:/dashboard";
		}
	
	}
	
	//--------------------------------------------------------------------------
	
	//borrar cancion
	@RequestMapping(value="songs/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	//--------------------------------------------------------------------------
	
	//topten
	
	@RequestMapping("/search/topten")
	public String topten(Model model) {
		List<Song> songs = songService.getTopTen();
		model.addAttribute("songs", songs);
		return "songs/top.jsp";
	}
	
	//--------------------------------------------------------------------------
	
	//buscar artista
	
	@RequestMapping("/search/{artist}")
	public String search(@PathVariable("artist") String artist, Model model) {
		List<Song> songs = songService.getSearchSongs(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("songs", songs);
		return "songs/search.jsp";
	}
	
	@PostMapping("/search")
	public String search(@RequestParam("artist") String artist) {
		return "redirect:/search/"+artist;
	}
}
