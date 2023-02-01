package com.minilib.springbootlibrary.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@DynamoDBTable(tableName = "book")
public class Book {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String bookId;
    @DynamoDBAttribute
    private String title;
    @DynamoDBAttribute
    private String author;
    @DynamoDBAttribute
    private String description;
    @DynamoDBAttribute
    private String category;
    @DynamoDBAttribute
    private String img;
    @DynamoDBAttribute
    private String URL;

}
