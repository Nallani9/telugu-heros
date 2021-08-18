package com.nallani.teluguheros.service;

import com.nallani.teluguheros.model.AAFilmography;
import com.nallani.teluguheros.model.Info;
import com.nallani.teluguheros.model.MaheshFilmography;
import com.nallani.teluguheros.model.NTRFilmography;
import com.nallani.teluguheros.repository.AAFilmRepository;
import com.nallani.teluguheros.repository.MaheshFilmRepository;
import com.nallani.teluguheros.repository.NTRFilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

@Service
public class DbProcess {

    @Autowired
    private AAFilmRepository aaFilmRepository;
    @Autowired
    private NTRFilmRepository ntrFilmRepository;
    @Autowired
    private MaheshFilmRepository maheshFilmRepository;

    @Autowired
    private Converter converter;

    public void toList(String line, String fileName, String hero) {
        Info info = new Info();
        String[] result = Arrays.stream(line.split("\\t+"))
                .map(String::toUpperCase)
                .toArray(String[]::new);

        Optional<String> first = Arrays.stream(result).findFirst();
        first.ifPresent(info::setYear);

        Arrays.stream(result)
                .skip(1)
                .findAny()
                .ifPresent(info::setMovieName);

        Arrays.stream(result)
                .skip(2)
                .findAny()
                .ifPresent(info::setActorRoleName);

        if(hero.equalsIgnoreCase("alluarjun")) {
            AAFilmography aaFilmography = new AAFilmography();
            aaFilmography.setMovieName(info.getMovieName());
            aaFilmography.setReleasedYear(info.getYear());
            aaFilmography.setRoleName(info.getActorRoleName());
            aaFilmRepository.save(aaFilmography);
            converter.convertToJson(info, fileName);
        }else if (hero.equalsIgnoreCase("jrntr")){
            NTRFilmography ntrFilmography = new NTRFilmography();
            ntrFilmography.setMovieName(info.getMovieName());
            ntrFilmography.setReleasedYear(info.getYear());
            ntrFilmography.setRoleName(info.getActorRoleName());
            converter.convertToJson(info, fileName);
            ntrFilmRepository.save(ntrFilmography);
        }else if (hero.equalsIgnoreCase("mahesh")){
            MaheshFilmography maheshFilmography = new MaheshFilmography();
            maheshFilmography.setMovieName(info.getMovieName());
            maheshFilmography.setReleasedYear(info.getYear());
            maheshFilmography.setRoleName(info.getActorRoleName());
            converter.convertToJson(info, fileName);
            maheshFilmRepository.save(maheshFilmography);
        }else {
            System.out.println("no hero present");
        }
    }
}
