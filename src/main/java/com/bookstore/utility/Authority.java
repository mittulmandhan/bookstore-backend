package com.bookstore.utility;

import org.springframework.security.core.GrantedAuthority;


public class Authority implements GrantedAuthority {

    
    private String name;

    public Authority(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getAuthority() {
		return this.name;
	}
	
	
	@Override
	public String toString() {
		
		return this.name;
	}
    
    
    
    
    
}
