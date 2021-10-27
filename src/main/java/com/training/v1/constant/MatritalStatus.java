package com.training.v1.constant;

public enum MatritalStatus {
	MARRIED("Married"), UNMARRIED("Not Married"), DIVORCED("Divorced"), SINGLE("Single"), SEPARATED("Separated");

	private String value;

	private MatritalStatus(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}