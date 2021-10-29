package com.training.dto;

import javax.validation.constraints.Size;

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
public class LoginForm {
	
	//@NotBlank
	@Size(min = 3, max = 100)
	private String username;

	//@NotBlank
	@Size(min = 6, max = 40)
	private String password;
}