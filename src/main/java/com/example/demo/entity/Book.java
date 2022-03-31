package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String author;
	
	@Column(nullable = true)
	private String tranlator;
	
	@Id
	private String isbn;
	
	@Column(nullable = false)
	private String publishers;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date publicationDate;
	
	@Column(nullable = false)
	private Integer pricing;
	
}
