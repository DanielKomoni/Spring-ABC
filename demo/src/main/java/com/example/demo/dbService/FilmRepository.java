package com.example.demo.dbService;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
    
    public List<Film> findByTag(String tag);

    public Film findByTitle(String title);
}
