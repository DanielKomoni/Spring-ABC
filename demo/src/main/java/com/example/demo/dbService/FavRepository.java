package com.example.demo.dbService;


import org.springframework.data.jpa.repository.JpaRepository;

public interface FavRepository extends JpaRepository<Fav, Integer> {
    
}
