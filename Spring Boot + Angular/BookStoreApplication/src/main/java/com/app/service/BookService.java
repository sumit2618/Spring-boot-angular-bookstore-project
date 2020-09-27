package com.app.service;

import java.util.List;

import com.app.entity.Book;


public interface BookService {
	
	public List<Book> findAll();
	
	public Book getBookDataById(int id);

}
