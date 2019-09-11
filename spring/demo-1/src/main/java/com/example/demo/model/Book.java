package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;


@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String ibsn;
	@OneToOne
	private Publisher publisher;
	
	@ManyToMany
	@JoinTable(name="author_book",joinColumns = @JoinColumn(name = "book_id"),
	inverseJoinColumns = @JoinColumn(name="author_id"))
	private Set<Author> author = new HashSet<Author>();

	public Book(String title, String ibsn, Publisher publisher) {
		super();
		this.title = title;
		this.ibsn = ibsn;
		this.publisher = publisher;
	}
	
	public Book(String title, String ibsn, Publisher publisher, Set<Author> author) {
		super();
		this.title = title;
		this.ibsn = ibsn;
		this.publisher = publisher;
		this.author = author;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIbsn() {
		return ibsn;
	}

	public void setIbsn(String ibsn) {
		this.ibsn = ibsn;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Set<Author> author) {
		this.author = author;
	}

 }
