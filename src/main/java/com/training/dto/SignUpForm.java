package com.training.dto;

import java.util.Set;

import javax.validation.constraints.Email;

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
public class SignUpForm {
//	@NotBlank
//	@Size(min = 3, max = 50)
	private String name;

//	@NotBlank
//	@Size(min = 3, max = 50)
	private String username;

	//@NotBlank
//	@Size(max = 60)
	@Email
	private String email;

	private Set<String> role;

//	@NotBlank
//	@Size(min = 6, max = 40)
	private String password;
	
	//@Size(min = 6, max = 40)
	private String mobileNumber;
	
	private String encryptedUserId;
	
}