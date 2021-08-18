package com.nallani.teluguheros.model;

public class UserRequest {

    private String hero;
    private String filePath;

    public String getFilePath() { return filePath; }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getHero() { return hero; }

    public void setHero(String hero) { this.hero = hero; }

    @Override
    public String toString() {
        return "UserRequest{" +
                "hero='" + hero + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
