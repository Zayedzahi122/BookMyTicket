package com.BookMy.Ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMy.Ticket.entity.Seat;
import com.BookMy.Ticket.entity.ShowSeat;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

	List<ShowSeat> findBySeatIn(List<Seat> seats);

}