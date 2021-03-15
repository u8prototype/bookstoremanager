package com.ebox.bookstoremanager.publishers.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.ebox.bookstoremanager.books.entity.Book;

import lombok.Data;

@Data
@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false, unique = true, length = 100)
	private String code;
		
	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate foundationDate;
	
	@OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
	private List<Book> books;
	
	
}