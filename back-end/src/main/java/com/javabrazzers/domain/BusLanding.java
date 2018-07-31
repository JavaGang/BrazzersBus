package com.javabrazzers.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "bus_landing_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class BusLanding extends BaseEntity {

	private int placeNumber;
	private Schedule schedule;
	private int ticket;

}