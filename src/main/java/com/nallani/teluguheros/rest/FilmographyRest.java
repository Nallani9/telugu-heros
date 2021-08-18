package com.nallani.teluguheros.rest;

import com.nallani.teluguheros.model.AAFilmography;
import com.nallani.teluguheros.model.UpdateInfo;
import com.nallani.teluguheros.model.UserRequest;
import com.nallani.teluguheros.repository.AAFilmRepository;
import com.nallani.teluguheros.repository.MaheshFilmRepository;
import com.nallani.teluguheros.repository.NTRFilmRepository;
import com.nallani.teluguheros.service.ProcessFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class FilmographyRest {

    @Autowired
    private ProcessFile processFile;

    @Autowired
    private AAFilmRepository aaFilmRepository;

    @Autowired
    private NTRFilmRepository ntrFilmRepository;

    @Autowired
    private MaheshFilmRepository maheshFilmRepository;

    @PostMapping("/save")
    public void saveDataToDB(@RequestBody UserRequest userRequest,
                             @Autowired HttpServletRequest servletRequest,
                             @Autowired HttpServletResponse servletResponse) {
        processFile.toJson(userRequest.getFilePath(), userRequest.getHero());
    }

    @DeleteMapping("/aadelete")
    public void deleteAaData() {
        aaFilmRepository.deleteAll();
    }

    @DeleteMapping("/ntrdelete")
    public void deleteNtrData() { ntrFilmRepository.deleteAll();
    }

    @DeleteMapping("/maheshdelete")
    public void deleteMaheshData() {
        maheshFilmRepository.deleteAll();
    }

    @PostMapping("/aaupdate")
    public void updateDb(@RequestBody UpdateInfo updateInfo) {
       AAFilmography filmography = aaFilmRepository.getById(updateInfo.getId());
       filmography.setCritic(updateInfo.getCritic());
       aaFilmRepository.save(filmography);
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}
