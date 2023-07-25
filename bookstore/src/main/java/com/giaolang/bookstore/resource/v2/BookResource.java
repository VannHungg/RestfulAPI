package com.giaolang.bookstore.resource.v2;

import java.util.ArrayList;
import java.util.List;

import com.giaolang.bookstore.dto.Book;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("v2/books")
public class BookResource {
	private List<Book> books = new ArrayList<>();

	public BookResource() {
		System.out.println("here");
		this.books.add(new Book("111", "111", "111", 1, 2001));
		this.books.add(new Book("222", "222", "222", 2, 2002));
		this.books.add(new Book("333", "333", "333", 3, 2003));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getAll () {
		return this.books;
	}
	
	@GET
	@Path("{masach}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getOne(@PathParam("masach") String isbn) {
		for (Book book : this.books) {
			if(book.getIsbn().equalsIgnoreCase(isbn)) {
				return book;
			}
		}
		return null;
	}
}