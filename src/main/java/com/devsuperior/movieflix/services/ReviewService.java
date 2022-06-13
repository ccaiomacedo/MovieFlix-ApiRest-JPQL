package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.dto.ReviewInsertDTO;
import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    @Autowired
    private AuthService service;

    @Transactional
    public ReviewDTO insert(ReviewInsertDTO dto) {
        Review entity = new Review();
        User user = service.authenticated();
        entity.setText(dto.getText());
        entity.setMovie(new Movie(dto.getMovieId()));
        entity = repository.save(entity);
        return new ReviewDTO(entity,new UserDTO(user));
    }
}
