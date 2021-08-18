package com.nallani.teluguheros.repository;

import com.nallani.teluguheros.model.AAFilmography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AAFilmRepository extends JpaRepository<AAFilmography, Integer> {

    List<AAFilmography> findAll();

}
