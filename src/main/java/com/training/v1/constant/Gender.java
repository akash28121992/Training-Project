package com.training.v1.constant;

public enum Gender {
	MALE("MALE"), FEMALE("FEMALE"), TRANSGENDER("TRANSGENDER"),OTHER("OTHER"), DONOTWANTTOSPECIFY("DO NOT WANT TO SPECIFY");

	private String value;

	private Gender(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}