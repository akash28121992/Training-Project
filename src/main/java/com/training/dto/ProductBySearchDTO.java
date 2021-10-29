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
public class ProductBySearchDTO {
	private String productPlaceId;
	private String productSearch;
	private byte[] productImageBase64;
	private String productImage;
	private String productImageContentType;
	private String productAddress;
	private String productShortAddress;
	private String photoReference;
	private String productRating;
	private String productReview;
	
	private List<String> ratingStarFill;
	private List<String> ratingStar;
}