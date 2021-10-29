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
public class ProductReviewDTO {
	private String id;
	private String reviewId;
	private String productRating;
	private String userName;
	private String userProfileImage;
	private String reviewDay;
	private String reviewDescription;
	private List<String> ratingStarFill;
	private List<String> ratingStar;
	private String helpfull;
	private String dishelpfull;
	private boolean likedByLoggedInUser;
	private boolean reportAbuseByLoggedInUser;
	private List<ReviewImagesDTO> uploads;
	private String userId;
	private int totalComments;
	private int disableComment;
}