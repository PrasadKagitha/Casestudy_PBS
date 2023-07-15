package com.omtbs.movieplatform.repositories;

import com.omtbs.movieplatform.entities.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRespository extends JpaRepository<Theater, Long> {

}
