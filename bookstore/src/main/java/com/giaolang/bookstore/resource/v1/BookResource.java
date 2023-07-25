package com.giaolang.bookstore.resource.v1;

import com.giaolang.bookstore.dto.Book;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("v1/books")
public class BookResource {
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String sayHello() {
//		return "One small meassage return from api!!";
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook() {
		return new Book("111", "abc", "dev", 10, 2021);
	}
}
