package com.BookMy.Ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMy.Ticket.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
