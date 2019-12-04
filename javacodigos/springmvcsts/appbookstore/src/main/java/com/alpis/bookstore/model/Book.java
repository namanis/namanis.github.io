package com.alpis.bookstore.model;


import java.util.List;

import com.alpis.bookstore.model.Author;

public class Book {
	private Long bookId;
	//private Long categoryId;
	private String bookTitle;
	private Author author;
	private List<Author> authors;
	private String authorNome;

	public Long getBookId() {
		return bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getAuthorNome() {
		return authorNome;
	}

	public void setAuthorNome(String authorNome) {
		this.authorNome = authorNome;
	}

	public String toString() {
		return "Book - Id: " + bookId  +", Book Title: " + bookTitle + ",Nome Author: " +author;
	}
	
}