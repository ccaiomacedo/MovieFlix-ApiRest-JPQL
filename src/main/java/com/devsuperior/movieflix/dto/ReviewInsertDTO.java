package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class ReviewInsertDTO implements Serializable {

    private static final long SerialVersionUID = 1L;

    private Long id;

    @NotBlank(message = "Campo obrigatório")
    private String text;
    private Long movieId;

    public ReviewInsertDTO() {
    }

    public ReviewInsertDTO(Long id, String text, Long movieId) {
        this.id = id;
        this.text = text;
        this.movieId = movieId;
    }

    public ReviewInsertDTO(Review entity) {
        id = entity.getId();
        text = entity.getText();
        movieId = entity.getMovie().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
