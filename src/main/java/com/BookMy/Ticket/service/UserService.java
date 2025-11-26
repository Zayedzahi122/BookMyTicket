package com.BookMy.Ticket.service;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.BookMy.Ticket.dto.LoginDto;
import com.BookMy.Ticket.dto.UserDto;

import jakarta.servlet.http.HttpSession;

public interface UserService {
	String register(UserDto userDto, BindingResult result);

	String login(LoginDto dto, RedirectAttributes attributes,HttpSession session);
}
