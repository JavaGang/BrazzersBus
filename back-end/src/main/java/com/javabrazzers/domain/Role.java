package com.javabrazzers.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
	USER, ADMIN, MANAGER, GUEST, DRIVER;

	//comment
	@Override
	public String getAuthority() {
		return name();
	}
}
