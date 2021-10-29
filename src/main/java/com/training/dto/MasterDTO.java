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
public class MasterDTO {
	private String key;
	private String value;
	private String orderBy;
	private String extra;
	private String extra1;
//	private String extra2;
//	private String extra3;
//	private String extra4;
}