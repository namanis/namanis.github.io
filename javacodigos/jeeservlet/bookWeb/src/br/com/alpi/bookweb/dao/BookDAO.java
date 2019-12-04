package br.com.alpi.bookweb.dao;

 import java.util.List;

import br.com.alpi.bookweb.model.Book;
import br.com.alpi.bookweb.model.Category;

 public interface BookDAO {
 public List<Book>findAllBooks();

 public List<Book>searchBooksByKeyword(String keyWord);

 public List<Category>findAllCategories();

 public void insert(Book book);

 public void update(Book book);

 public void delete(Long bookId);
}
 