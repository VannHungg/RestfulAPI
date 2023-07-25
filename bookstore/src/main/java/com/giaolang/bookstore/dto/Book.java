package com.giaolang.bookstore.dto;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//import javax.persistence.Entity;
//import javax.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Interface Serializable để báo hiệu cho máy ảo biết là ...

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Book implements Serializable{
	@Id
	private String isbn;
	private String title;
	private String author;
	private int edition; //số lần xuất bản
	private int publicshedYear;
}
