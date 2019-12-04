package br.com.alpi.melhorespraticas.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alpi.melhorespraticas.model.Author;
import br.com.alpi.melhorespraticas.model.Book;

public class BookController extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Book book = new Book();
book.setBookTitle("Learning Java Web");
Author author = new Author();
author.setName("Vishal Layka");
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