package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.dbService.Film;
import com.example.demo.dbService.FilmService;

import org.springframework.ui.Model; 

@Controller
@RequestMapping("films")
public class PublicController {
    
    @Autowired
    private FilmService filmService;

    @GetMapping("/allFilms")
    public String getCatalogue(Model model) {

        List<Film> films = filmService.getAllFilms();
        model.addAttribute("films", films);
        return "allFilms";
    }

    @GetMapping("/film/{id}")
    public String getFilmById(Model model, int id) {

        Film film = filmService.getFilmById(id);
        model.addAttribute("film", film);
        return "film";
    }

    @GetMapping("/film/{title}")
    public String getFilmByTitle(Model model, String title) {

        Film film = filmService.getFilmByTitle(title);
        model.addAttribute("film", film);
        return "film";
    }

    @GetMapping("/allFilms/{tag}")
    public String getFilmsByTag(Model model, String tag) {

        List<Film> films = filmService.getFilmsByTag(tag);
        model.addAttribute("films", films);
        return "allFilms";
    }

    
}
