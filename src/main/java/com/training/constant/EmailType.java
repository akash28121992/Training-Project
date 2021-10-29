package com.training.constant;

public enum EmailType {
	SEND_MAIL_TO_USER_OTP("SEND_MAIL_TO_USER_OTP"),
	
	;
    private final String title;
	
	private EmailType(final String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	} 
}