package com.minilib.springbootlibrary.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.minilib.springbootlibrary.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Book save(Book book){
        dynamoDBMapper.save(book);
        return book;
    }

    public Book getBookById(String bookId){
        return dynamoDBMapper.load(Book.class, bookId);
    }

    public String delete(String bookId){
        Book book = dynamoDBMapper.load(Book.class, bookId);
        dynamoDBMapper.delete(book);
        return "Book deleted!";
    }

    public String update(String bookId, Book book){
        dynamoDBMapper.save(book,
                new DynamoDBSaveExpression()
                        .withExpectedEntry(bookId, new ExpectedAttributeValue(
                                new AttributeValue().withS(bookId)
                        )));
        return bookId;
    }
}
