package com.javabrazzers.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "country_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Country extends BaseEntity {
	@NotBlank(message = "error.country.countryname.isnull")
	@Size(min = 3, max = 100, message = "errors.country.countryName.value.size")
	@Column(name = "country", nullable = false, length = 50,unique = true)
	private String countryName;

}