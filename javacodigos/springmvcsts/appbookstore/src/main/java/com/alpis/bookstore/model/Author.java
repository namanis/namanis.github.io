package com.alpis.bookstore.model;

//import java.util.List;

public class Author {


	//private Long id;
	private Long bookId;
	private Long authorId;
	private String authorNome;
	private String firstName;
	private String lastName;
	
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	public String  getAuthorNome() {
		return authorNome;
	}
	public void setAuthorNome(String authorNome) {
		this.authorNome = authorNome;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//public Long getId() {
	//	return id;
	//}
	//public void setId(Long id) {
	//	this.id = id;
//	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	
	public String toString() {
		return "Author - Id: "+ authorId +", First Name: "
				+ firstName + ", Last Name: " + lastName +", Nome Author:"+authorNome;
	}
}
