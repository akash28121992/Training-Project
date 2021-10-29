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
public class TopRatingReviewsDTO {
	private String encryptedProductId;
	private Integer totalReview;
	private String totalRating;
	private String placeId;
}