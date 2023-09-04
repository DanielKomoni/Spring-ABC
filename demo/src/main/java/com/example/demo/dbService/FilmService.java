package com.example.demo.dbService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }
    
    public Film getFilmByTitle(String title) {
        return filmRepository.findByTitle(title);
    }

    public void addFilm(Film film) {
        filmRepository.save(film);
    }

    public List<Film> getFilmsByTag(String tag) {
        return filmRepository.findByTag(tag);
    }

    public Film getFilmById(int id) {
        return filmRepository.findById(id).orElse(null);
    }

}
