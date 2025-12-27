package com.BookMy.Ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMy.Ticket.entity.BookedTicket;

public interface TicketRepository extends JpaRepository<BookedTicket, Long> {
	
}
