package com.javabrazzers.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "bus_station_tbl")
@AllArgsConstructor
@NoArgsConstructor

public class BusStation extends BaseEntity {

	@NotBlank(message = "error.city.stationname.isnull")
	@Size(min = 3, max = 100, message = "errors.bus_station.bus_station_name.value.size")
	@Column(name = "bus_station_name", nullable = false, length = 50,unique = true)
	private String busStationName;

	@Size(min = 3, max = 100, message = "errors.bus_station.street.value.size")
	@Column(name = "street", nullable = false, length = 50,unique = true)
	private String streetName;

	@Size(min = 3, max = 100, message = "errors.bus_station.latitude.value.size")
	@Column(name = "latitude", nullable = false, length = 50,unique = true)
	private String latitude;

	@Size(min = 3, max = 100, message = "errors.bus_station.longitude.value.size")
	@Column(name = "longitude", nullable = false, length = 50,unique = true)
	private String longitude;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "city_tbl")
	private City city;

}