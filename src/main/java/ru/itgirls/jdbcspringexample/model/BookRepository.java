package ru.itgirls.jdbcspringexample.model;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    Book findBookById(Long id);
}