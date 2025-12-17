package com.BookMy.Ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMy.Ticket.entity.Screen;
import com.BookMy.Ticket.entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long>{
	List<Show> findByScreen(Screen screen);
}
