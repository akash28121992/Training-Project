package com.training.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Category")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Category extends Domain<Integer> implements Serializable {

	private static final long serialVersionUID = 7941268685572272503L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryIds")
	private Integer categoryId;
	
	
	@Column(name="Name")
	private String categoryName;
	
	@Column(name="Prefix")
	private String categoryPrefix;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private StatusEnum status;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private IsTrainingEnum trainingStatus;
	
	@Column(name="SPCLearners")
	private Integer active;
	
	
//	@Temporal(TemporalType.DATE)
//	@Column(name="CREATED_AT")
//	private Date createdAt;
//	
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="UPDATED_AT")
//	private Date updatedAt;
	
}