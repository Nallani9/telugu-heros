package com.nallani.teluguheros.model;

import java.util.Date;

public class Info {

    private String year;
    private String movieName;
    private String actorRoleName;
    private Date releaseDate;
    private String movieTalk;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorRoleName() {
        return actorRoleName;
    }

    public void setActorRoleName(String actorRoleName) {
        this.actorRoleName = actorRoleName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMovieTalk() {
        return movieTalk;
    }

    public void setMovieTalk(String movieTalk) {
        this.movieTalk = movieTalk;
    }

    @Override
    public String toString() {
        return "Info{" +
                "year='" + year + '\'' +
                ", movieName='" + movieName + '\'' +
                ", actorRoleName='" + actorRoleName + '\'' +
                ", releaseDate=" + releaseDate +
                ", movieTalk='" + movieTalk + '\'' +
                '}';
    }
}
