package com.training.v1.constant;

public enum RoleType {
	ROLE_SUP_ADMIN (2), 
	ROLE_TEACHER (3), 
	ROLE_STUDENT (4), 
	ROLE_PARENT (5),
	ROLE_HOD (6), 
	ROLE_ALUMNI (7), 
	ROLE_RATING (8), 
	ROLE_SCHOOL (11),
	ROLE_SUB_ADMIN (9), 
	ROLE_SCHOOL_ADMIN (10),
	ROLE_SCHOOL_B2B (12),
	ROLE_AUDITOR (13),
	ROLE_COUNSELOR (14),
	ROLE_COMMON_PAYMENT(19)
	//ROLE_SCHOOL_DIRECTOR (12)
	;
	
	private Integer activityValue;
	private String value;

	private RoleType(final String value){
		this.value = value;
	}
	private RoleType(final Integer activityValue){
		this.activityValue = activityValue;
	}

	public Integer getactivityValue() {
		return activityValue;
	}
	public String getValue() {
		return value;
	}
}