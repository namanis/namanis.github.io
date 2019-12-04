package com.alpi.books.service;
import java.util.List;
import com.alpi.books.dao.BookDAO;
import com.alpi.books.model.Book;
public class BookServiceImpl implements BookService {
	private BookDAO bookDao ;
	public void setBookDao(BookDAO bookDao) {
	this.bookDao = bookDao;
	}
	public List<Book> getAllBooks() {
	List<Book> bookList = bookDao.findAllBooks();
	return bookList;
	}
	}

