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
public class UserExistResponse {
	private String encryptedUserId;
	private String message;
	private String status;
	private String statusCode;
	private String error;
	private String path;
	private String timestamp;
	private String token;
	@Builder.Default
    private String type = "Bearer";
}
