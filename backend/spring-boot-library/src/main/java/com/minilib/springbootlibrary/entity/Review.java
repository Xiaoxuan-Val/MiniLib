package com.minilib.springbootlibrary.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "review")
public class Review {
    @DynamoDBAttribute
    private String reviewId;
    @DynamoDBAttribute
    private String userEmail;
    @DynamoDBAttribute
    private String date;
    @DynamoDBAttribute
    private Float rating;
    @DynamoDBAttribute
    private Long bookId;
    @DynamoDBAttribute
    private String description;

}
