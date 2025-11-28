package com.BookMy.Ticket.service;

import com.BookMy.Ticket.dto.UserDto;

public interface RedisService {
	 
	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getDtoByEmail(String email);

	int getOtpByEmail(String email);
}
