package com.BookMy.Ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMy.Ticket.entity.Screen;
import com.BookMy.Ticket.entity.Theater;

public interface ScreenRepository extends JpaRepository<Screen, Long> {
	List<Screen> findByTheater(Theater theater);

	boolean existsByNameAndTheater(String name, Theater theater);
}
