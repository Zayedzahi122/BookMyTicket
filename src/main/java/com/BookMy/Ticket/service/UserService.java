package com.BookMy.Ticket.service;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.BookMy.Ticket.dto.LoginDto;
import com.BookMy.Ticket.dto.UserDto;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

public interface UserService {
	
	
	
	String register(UserDto userDto, BindingResult result,RedirectAttributes attributes);

	String login(LoginDto dto, RedirectAttributes attributes,HttpSession session);

	String logout(HttpSession session, RedirectAttributes attributes);

	String submitOtp(int otp, String email, RedirectAttributes attributes);

	
}
