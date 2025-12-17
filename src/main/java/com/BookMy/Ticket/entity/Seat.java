package com.BookMy.Ticket.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String seatNumber;
	private String seatRow;
	private Integer seatColumn;
	private String category;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(
	        name = "screen_id",
	        nullable = false
	    )
	    private Screen screen;
}