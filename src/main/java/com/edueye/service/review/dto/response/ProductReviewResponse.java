package com.edueye.service.review.dto.response;

import java.util.List;

import com.training.dto.ProductReviewDTO;

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
public class ProductReviewResponse {
	private String status;
	private String message;
	private String statusCode;
	private List<ProductReviewDTO> productReviewList;
	private Integer totalRows;
}
