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

public class ReviewCommentsDTO {
	private String id;
	private String reviewId;
	private String reviewComment;
	private String userName;
	private String userProfileImg;
	private String commentDays;
	
	
	
	
}
