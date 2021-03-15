package com.ebox.bookstoremanager.users.entity.users.enums;

import javax.annotation.Generated;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {

	MALE("Male"),
	FEMALE("Female");
		
	private String description;
	
	Gender (String description){		
		this.description = description;		
	}	
	
	
	
}
