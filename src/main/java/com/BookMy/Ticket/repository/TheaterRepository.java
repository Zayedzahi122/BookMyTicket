package com.BookMy.Ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMy.Ticket.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long>{
	
	boolean existsByNameAndAddress(String name, String address);
}
