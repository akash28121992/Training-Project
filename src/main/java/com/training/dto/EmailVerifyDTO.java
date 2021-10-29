package com.training.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class EmailVerifyDTO {
	
	private  String email;
	private  Integer status;
	private  String status_description;
	private  Integer smtp_code;
	private  String smtp_log;
}