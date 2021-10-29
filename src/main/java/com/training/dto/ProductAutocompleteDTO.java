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
public class ProductAutocompleteDTO {
	private String productId;
	private String categoryId;
	private String productName;
	private String collectionType;
	private String productCategory;
	private String productImgIcon;
	private String address;
	private String landmark;
	private String country;
	private String state;
	private String city;
	private String zipcode;
	private String productLatitude;
	private String productLongitude;
	
	
}
