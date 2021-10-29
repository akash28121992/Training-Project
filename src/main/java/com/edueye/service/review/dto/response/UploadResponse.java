package com.edueye.service.review.dto.response;

import java.util.List;

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
public class UploadResponse {
//	private String timestamp;
//	private String path;
	private String status;
	private String error;
	private String message;
	private String statusCode;
	private List<UploadedFile> uploadedFiles;
}
