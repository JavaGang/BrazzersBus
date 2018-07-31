package com.javabrazzers.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ticket_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends BaseEntity {

	private LocalDateTime purchase_date;
	private int ticketNumber;
	private User User;

}