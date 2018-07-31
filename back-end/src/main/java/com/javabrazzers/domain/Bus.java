package com.javabrazzers.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "bus_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Bus extends BaseEntity {
	@NotBlank
	@Size(min = 3, max = 100, message = "errors.bus.value.max")
	@Column(name = "bus_brand", nullable = false, length = 255,unique = true)     //unique уникальное значение
	private String busBrand;
	private Integer placeAmount;
	private Boolean condition;
	private Boolean wifi;


}