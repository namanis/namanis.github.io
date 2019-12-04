package com.alpi.books.client;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.alpi.books.model.Book;
import com.alpi.books.service.BookService;

public class BookApp {
public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
BookService bookService =(BookService) context.getBean("service");
// List all books
System.err.println("Listing all Books:");
List<Book> bookList= bookService.getAllBooks();

for(Book b: bookList){
System.out.println(b.getId()+"--"+b.getBookTitle());
}
}
}