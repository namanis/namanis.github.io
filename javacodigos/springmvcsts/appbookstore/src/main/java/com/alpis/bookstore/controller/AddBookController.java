package com.alpis.bookstore.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import com.alpis.bookstore.model.Author;
import com.alpis.bookstore.model.Book;
import com.alpis.bookstore.service.AuthorService;
import com.alpis.bookstore.service.BookService;
import com.alpis.bookstore.validator.BookValidator;

@Controller
@RequestMapping("/addBook.html")
public class AddBookController {
	BookValidator bookValidator;

	 @Autowired
	 public AddBookController(BookValidator bookValidator) {
	 this.bookValidator = bookValidator;
	 }

@RequestMapping(method = RequestMethod.GET)
public String initForm(ModelMap model) {
Book book = new Book();
book.setBookTitle("Add Book :");
model.addAttribute("book", book);
return "addBook";
}

@InitBinder
public void initBinder(WebDataBinder binder, WebRequest request) {
binder.setDisallowedFields(new String[] {"author"});
Book book = (Book)binder.getTarget();
binder.addValidators(bookValidator);
AuthorService authorService = new AuthorService();
Long authorId = null;
try {
authorId = Long.parseLong(request.getParameter("author"));
} catch (Exception e) {}
if (authorId != null) {
Author author = authorService.getAuthorById(authorId);
book.setAuthor(author);
}
}

@ModelAttribute("authorList")
public List<Author> populateAuthorList() {
AuthorService authorService = new AuthorService();
return authorService.getAuthorList();
}

@RequestMapping(method = RequestMethod.POST)
public String saveBook( @ModelAttribute("book") @Validated Book book, BindingResult result, SessionStatus status) {
if(result.hasErrors()) {
	
	return "addBook";
	
} if(!result.hasErrors()) {
	
	BookService bookService = new BookService();
	bookService.createBook(book);

}
return "redirect:/list_book.html";

}
}




