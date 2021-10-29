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

public class ReviewImagesDTO {
	private String imageId;
	private String uploadType;
	private String reviewAttribute;
	private String publicId;
	
}
