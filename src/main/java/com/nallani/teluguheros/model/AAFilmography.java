package com.nallani.teluguheros.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alluarjun")
public class AAFilmography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieName;

    private String releasedYear;

    private String roleName;

    private String heroinName;

    private String critic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(String releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getHeroinName() {
        return heroinName;
    }

    public void setHeroinName(String heroinName) {
        this.heroinName = heroinName;
    }

    public String getCritic() {
        return critic;
    }

    public void setCritic(String critic) {
        this.critic = critic;
    }
}
