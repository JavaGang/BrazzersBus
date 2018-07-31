package com.javabrazzers.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "schedule_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Schedule extends BaseEntity {

	private LocalDateTime departureDate;
	private BusRoute busRoute;

	@OneToMany
	private Bus Bus;

}