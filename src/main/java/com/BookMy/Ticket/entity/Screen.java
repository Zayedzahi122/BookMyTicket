package com.BookMy.Ticket.entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String type;

	@ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

    @OneToMany(
        mappedBy = "screen",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Seat> seats;
	
	
}
