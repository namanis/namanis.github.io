package br.com.alpi.bookstore.dao;

import java.util.List;

import br.com.alpi.bookstore.model.Book;
import br.com.alpi.bookstore.model.Category;
import br.com.alpi.bookstore.model.User;

public interface BookDAO {
	public List<Book> findAllBooks();

	public List<Book> searchBooksByKeyword(String keyWord);

	public List<Category> findAllCategories();

	public List<Book> findBooksByCategory(int categoryId);

	public void insert(Book book);

	public void update(Book book);

	public void delete(Long bookId);

	public boolean isUserAllowed(User user);

}
