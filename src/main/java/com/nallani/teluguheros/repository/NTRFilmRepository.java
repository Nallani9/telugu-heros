package com.nallani.teluguheros.repository;

import com.nallani.teluguheros.model.AAFilmography;
import com.nallani.teluguheros.model.NTRFilmography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NTRFilmRepository extends JpaRepository<NTRFilmography, Long> {

    List<NTRFilmography> findAll();
}
