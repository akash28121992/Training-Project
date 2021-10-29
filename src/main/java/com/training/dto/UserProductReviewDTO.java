package com.training.dto;


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

public class UserProductReviewDTO {
	private String reviewId;
	//private String reviewType;
	private String reviewDay;
	private String reviewDescription;
//	private String productImage;
	private String productId;
	private String placeId;
	private String productName;
	private String productAddress;
	private String productShortAddress;
	private String productRating;
	private String helpful;
	private String unhelpful;
	private boolean likedByLoggedInUser;
	private List<ReviewImagesDTO> uploads;
	private List<ProductImageDTO> images;
	private List<String> ratingStarFill;
	private List<String> ratingStar;
	private String userId;
	private int totalComments;
}