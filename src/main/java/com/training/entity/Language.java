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
@Table(name = "Language")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Language extends Domain<Integer> implements Serializable {

	private static final long serialVersionUID = 7941268685572272503L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LangId")
	private Integer langId;
	
	
	@Column(name="CategoryId")
	private Integer categoryId;
	
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
	
//	SELECT t1.Name,t1.CategoryIds,t2.LangId,t2.LangName FROM Category AS t1 Inner JOIN `Language` AS t2
//	ON t1.CategoryIds=t2.CategoryId WHERE t1.`Status` = 'Live'
//	ORDER BY t1.CategoryIds DESC;
	
}