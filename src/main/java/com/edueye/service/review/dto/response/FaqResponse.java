package com.edueye.service.review.dto.response;

import java.util.List;

import com.training.dto.FaqDTO;

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
public class FaqResponse {
	private String status;
	private String message;
	private String statusCode;
	private List<FaqDTO> faqs;
}
