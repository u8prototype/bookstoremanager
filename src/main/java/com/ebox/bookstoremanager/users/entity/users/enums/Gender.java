package com.ebox.bookstoremanager.users.entity.users.enums;

import javax.annotation.Generated;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor	
public enum Gender {

	MALE("Male"),
	FEMALE("Female");

  
	private final String description;

    /**
     * @param text
     */
	Gender(final String text) {
        this.description = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return description;
    }
	
}
