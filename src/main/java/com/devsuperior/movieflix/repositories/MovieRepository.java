package com.devsuperior.movieflix.repositories;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("select DISTINCT obj from Movie obj " +
            "INNER JOIN obj.genre gen "+
            "Where COALESCE(:genre) IS NULL OR gen IN  :genre " +
            "ORDER BY obj.title ")
    Page<Movie> find(Genre genre, Pageable pageable);

}
