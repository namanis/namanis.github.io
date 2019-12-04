package com.alpi.aop;

public class Book {
private long id;
private String title;
	public void setId(long bookId) {
		// TODO Auto-generated method stub
		this.id=bookId;
	}

	public void setBookTitle(String bookTitle) {
		// TODO Auto-generated method stub
		this.title=bookTitle;
	}

	public String getBookTitle() {
		// TODO Auto-generated method stub
		return title;
	}
public Long getId(){
	return id;
}
}
