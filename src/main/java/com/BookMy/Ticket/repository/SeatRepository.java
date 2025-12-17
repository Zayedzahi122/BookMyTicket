package com.BookMy.Ticket.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMy.Ticket.entity.Screen;
import com.BookMy.Ticket.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long>{
	List<Seat> findByScreenOrderBySeatRowAscSeatColumnAsc(Screen screen);

}
