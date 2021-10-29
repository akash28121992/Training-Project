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
public class ProductImageDTO {
	private String productImageId;
	private byte[] productImage;
	private String productIcon;
	private String productImageType;
	private String productOrder;
	private String photoReference;
}