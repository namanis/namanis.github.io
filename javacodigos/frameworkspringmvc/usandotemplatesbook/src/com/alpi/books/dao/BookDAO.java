package com.alpi.books.dao;


	import java.util.List;
	import com.alpi.books.model.Book;
	import com.alpi.books.model.Category;
	
	public interface BookDAO{
	public List<Book> findAllBooks();
	}

