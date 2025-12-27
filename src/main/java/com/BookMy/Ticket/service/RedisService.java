package com.BookMy.Ticket.service;

import com.BookMy.Ticket.dto.UserDto;
import com.BookMy.Ticket.entity.BookedTicket;

public interface RedisService {
	 
	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getDtoByEmail(String email);

	int getOtpByEmail(String email);
	
	void saveTicket(String id, BookedTicket ticket);

	BookedTicket getTicket(String razorpay_order_id);

}
