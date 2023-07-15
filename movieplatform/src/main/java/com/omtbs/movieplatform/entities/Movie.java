package com.omtbs.movieplatform.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Movie")
public class Movie {

    @Id
    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_release_date")
    private LocalDateTime movieReleaseDate;

    @Column(name = "movie_rated_type")
    private String movieRatedType;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public LocalDateTime getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(LocalDateTime movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public String getMovieRatedType() {
        return movieRatedType;
    }

    public void setMovieRatedType(String movieRatedType) {
        this.movieRatedType = movieRatedType;
    }
}
