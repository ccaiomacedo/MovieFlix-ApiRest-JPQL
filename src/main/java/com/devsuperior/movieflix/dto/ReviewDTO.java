package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

import java.io.Serializable;

public class ReviewDTO implements Serializable {

    private static final long SerialVersionUID = 1L;

    private Long id;
    private String text;
    private Long movieId;
    private UserDTO user;

    public ReviewDTO() {
    }

    public ReviewDTO(Long id, String text, Long movieId, UserDTO user) {
        this.id = id;
        this.text = text;
        this.movieId = movieId;
        this.user = user;
    }

    public ReviewDTO(Review entity, UserDTO user) {
        id = entity.getId();
        text = entity.getText();
        movieId = entity.getMovie().getId();
        this.user = user;
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

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
