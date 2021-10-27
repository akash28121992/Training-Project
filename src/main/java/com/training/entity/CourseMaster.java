/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.training.entity;


import lombok.Data;

import javax.persistence.*;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "CertificateCourseMaster")
@Data
public class CourseMaster {
     @Id
     @Column(name = "CourseId")
     Long courseId;
     @Column(name = "CategoryId")
     Integer categoryId;
     @Column(name = "LangId")
     Integer langId;
     @Column(name = "Title")
     String title;
     @Column(name = "CourseName")
     String courseName;
     @Column(name = "IsTranding")
     Integer isTranding;
     @Column(name = "IsDependent")
     Integer isDependent;
     @Column(name = "Learners")
     Integer learners;
     @Column(name = "CourseType")
     @Enumerated(EnumType.STRING)
     CourseTypeEnum courseType;
     @Column(name = "Duration")
     Integer duration;
     @Column(name = "Statement")
     String statement;
     @Column(name = "AboutCourse")
     String aboutCourse;
     @Column(name = "Summary")
     String summary;
     @Column(name = "QuickContents")
     String quickContents;
     @Column(name = "Price")
     Integer price;
     @Column(name = "Discount")
     Integer discount;
     @Column(name = "Status")
     @Enumerated(EnumType.STRING)
     StatusEnum status;
     @Column(name = "Rating")
     Float rating;
     @Column(name = "RatingCount")
     Integer ratingCount;
     @Column(name = "CompletionRate")
     Float completionRate;
     @Column(name = "Ordering")
     Integer ordering;
     @Column(name = "tag")
//     @Enumerated(EnumType.ORDINAL)
     String tag;
     @Column(name = "bgColor")
     String bgColor;
     @Column(name = "Image")
     String image;
}
