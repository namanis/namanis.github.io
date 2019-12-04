  package com.alpis.bookstore.service;


import java.util.LinkedList;
import java.util.List;
import com.alpis.bookstore.model.Author;

public class AuthorService {
	private static List<Author> authorList;

	static {
		Author author1 = new Author();
		author1.setAuthorId((long) 2);
		author1.setFirstName("Jeff");
		author1.setLastName(" Brown");
        author1.setAuthorNome("Jeff Brown");

		Author author2 = new Author();
		author2.setAuthorId((long) 3);
		author2.setFirstName("Seth");
		author2.setLastName("Ladd");
		author2.setAuthorNome("Seth Ladd");
		
		Author author3 = new Author();
		author3.setAuthorId((long) 4);
		author3.setFirstName("Alan");
		author3.setLastName("Santos");
		author3.setAuthorNome("Alan Santos");
		
		authorList = new LinkedList<Author>();
		authorList.add(author1);
		authorList.add(author2);
		authorList.add(author3);
	}

	public List<Author> getAuthorList() {
		return authorList;
	}

	public Author getAuthorById(long id) {
		for (Author author : authorList) {
			if (author.getAuthorId().equals(id))
				return author;
		}
		return null;
	}
}
