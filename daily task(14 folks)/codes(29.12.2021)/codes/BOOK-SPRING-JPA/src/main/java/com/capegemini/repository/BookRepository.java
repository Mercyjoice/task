/*
 * @Author AMIT 
 * JPA Repository are avaliable here
 */
package com.capegemini.repository;

import org.springframework.data.repository.CrudRepository;

import com.capegemini.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
