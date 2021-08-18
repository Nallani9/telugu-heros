package com.nallani.teluguheros.repository;

import com.nallani.teluguheros.model.AAFilmography;
import com.nallani.teluguheros.model.MaheshFilmography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaheshFilmRepository extends JpaRepository<MaheshFilmography, Long> {

    List<MaheshFilmography> findAll();
}
