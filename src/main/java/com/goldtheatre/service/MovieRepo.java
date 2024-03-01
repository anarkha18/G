package com.goldtheatre.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goldtheatre.beans.MovieDetails;

@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Long> {

}
