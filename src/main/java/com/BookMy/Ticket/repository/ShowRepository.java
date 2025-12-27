package com.BookMy.Ticket.repository;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMy.Ticket.entity.Movie;
import com.BookMy.Ticket.entity.Screen;
import com.BookMy.Ticket.entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long> {

	List<Show> findByScreen(Screen screen);
	
	
	List<Show> findByShowDateAfter(LocalDate minusDays);

	List<Show> findByMovieAndShowDateAfter(Movie movie, LocalDate minusDays);

	boolean existsByScreen(Screen screen);

	boolean existsByMovie(Movie movie);

	List<Show> findByShowDateAndMovie(LocalDate date, Movie movie);
}
