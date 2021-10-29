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
public class Response {
	private String timestamp;
	private String status;
	private String error;
	private String message;
	private String path;
	private String statusCode;

}