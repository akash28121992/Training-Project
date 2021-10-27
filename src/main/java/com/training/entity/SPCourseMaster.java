/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.training.entity;


import lombok.Data;

import javax.persistence.*;

/**
 * @author Rahul
 */
@Entity
@Table(name = "SPCourseMaster")
@Data
public class SPCourseMaster {
     @Id
     @Column(name = "SPCourseId")
     Long SPCourseId;
     @Column(name = "Title")
     String title;
     @Column(name = "IsTranding")
     Integer isTranding;
     @Column(name = "Duration")
     Integer duration;
     @Column(name = "Price")
     Integer price;
     @Column(name = "Rating")
     Float rating;
     @Column(name = "RatingCount")
     Integer ratingCount;
     @Column(name = "Learners")
     Integer learners;
     @Column(name = "CreatedBy")
     String CreatedBy;
     @Column(name = "Status")
     @Enumerated(EnumType.STRING)
     StatusEnum status;
}