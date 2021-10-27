/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.training.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "BatchMaster")
@Data
public class BatchMaster {
     @Id
     @Column(name = "BatchId")
     Integer batchId;
     @Column(name = "CourseId")
     Long courseId;
     @Column(name = "batchType")
     @Enumerated(EnumType.STRING)
     BatchTypeEnum batchType;
     @Column(name = "StartTime")
     String startTime;
     @Column(name = "EndTime")
     String endTime;
     @Column(name = "Duration")
     Integer duration;
     @Column(name = "Status")
     @Enumerated(EnumType.STRING)
     BatchStatusEnum status;
     @Column(name = "LiveStatus")
     @Enumerated(EnumType.STRING)
     LiveStatusEnum liveStatus;
     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
     @JsonFormat(pattern = "yyyy-MM-dd")
     @Column(name = "StartDate")
     Date startDate;
     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
     @JsonFormat(pattern = "yyyy-MM-dd")
     @Column(name = "EndDate")
     Date endDate;
     @Column(name = "RemDays")
     Integer remDays;
}
