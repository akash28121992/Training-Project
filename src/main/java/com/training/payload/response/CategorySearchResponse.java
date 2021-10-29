package com.training.payload.response;

import java.util.List;


import com.training.dto.CategoryDTO;

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
public class CategorySearchResponse {
	private String status;
	private String message;
	private String statusCode;
	private List<CategoryDTO> products;
}
