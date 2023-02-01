package com.minilib.springbootlibrary.repository;
import com.minilib.springbootlibrary.entity.Book;
import lombok.extern.apachecommons.CommonsLog;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableScan
@Repository
public interface BookRepository extends CrudRepository<Book, String> {
     Optional<Book> findById(String bookId);
}
