package com.edueye.service.review.dto.response;

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
public class JwtResponse {
	private String token;
	@Builder.Default
    private String type = "Bearer";
	private String encryptedUserId;
	private String message;
	private String statusCode;
	private String status;
	private String error;
	private String path;
	private String timestamp;
	
}