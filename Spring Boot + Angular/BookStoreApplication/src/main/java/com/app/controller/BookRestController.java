package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Book;
import com.app.entity.dao.BookRepository;
import com.app.service.BookService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookRestController {

	private BookService bookService;

	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/data")
	public List<Book> getBookData() {

		return bookService.findAll();
	}

	@GetMapping("/dataById/{bookId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Book getBookDataById(@PathVariable int bookId) {
		//return bookService.;
		return bookService.getBookDataById(bookId);
	}

}
