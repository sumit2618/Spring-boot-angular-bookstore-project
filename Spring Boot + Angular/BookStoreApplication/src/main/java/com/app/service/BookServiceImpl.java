package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.entity.Book;
import com.app.entity.dao.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		
		this.bookRepository = bookRepository;
	}

	@Override
	public List<Book> findAll() {	
		return bookRepository.findAll();
	}
	
	@Override
	public Book getBookDataById(int id) {
		// TODO Auto-generated method stub
		Optional<Book> result = bookRepository.findById(id);
		
		Book theBook = null;
		if (result.isPresent()) {
			theBook = result.get();
		} else {
			// we did not find the employee
			throw new RuntimeException("Did not find employee = " + id);
		}
		return theBook;
	}
	
}
