package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

@RestController
@RequestMapping("book")
public class BookContoller {

	@Autowired
	private BookDao dao;

	@GetMapping("search")
	public ResponseEntity<Object> get() {
		return new ResponseEntity<>(this.dao.findAll(), HttpStatus.OK);
	}

	@PostMapping("add")
	public ResponseEntity<Object> post(@RequestBody Book book) {
		this.dao.save(book);
		return new ResponseEntity<>("add success", HttpStatus.OK);
	}

	@PutMapping("update")
	public ResponseEntity<Object> put(@RequestBody Book book) {
		this.dao.save(book);
		return new ResponseEntity<>("update success", HttpStatus.OK);
	}

	@DeleteMapping("delete")
	public ResponseEntity<Object> delete(@RequestBody Book book) {
		this.dao.delete(book);
		return new ResponseEntity<>("delete success", HttpStatus.OK);
	}

}
