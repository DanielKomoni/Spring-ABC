package com.example.demo.dbService;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Fav {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private int user_id; ;
    private String favFilm;
    private String tag; 

    public Integer getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getFavFilm() {
        return favFilm;
    }

    public String getTag() {
        return tag;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setFavFilm(String favFilm) {
        this.favFilm = favFilm;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
