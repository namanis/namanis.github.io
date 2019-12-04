package com.alpi.capitulo3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alpi.capitulo3.model.Book;
import com.alpi.capitulo3.model.Author;


public class BookController extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
Book book = new Book();
book.setBookTitle("Learning Java Web");
Author author = new Author();
author.setName("Alan Santos");
book.setAuthor(author);

request.setAttribute("bookAttrib", book);

RequestDispatcher view = request.getRequestDispatcher("/book.jsp");
view.forward(request, response);
/*RequestDispatcher view1 = request.getRequestDispatcher("/form.jsp");
view1.forward(request, response);
RequestDispatcher view2 = request.getRequestDispatcher("/result.jsp");
view2.forward(request, response);*/
}

}