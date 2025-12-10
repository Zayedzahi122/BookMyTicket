package com.BookMy.Ticket.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMy.Ticket.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	boolean existsByNameAndReleaseDate(String name, LocalDate releaseDate);
}
