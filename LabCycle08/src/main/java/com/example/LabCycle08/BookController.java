package com.example.LabCycle08;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	List<Book> list = new ArrayList<Book>();

	@GetMapping
	public List<Book> getBooks() {
		return list;
	}

	@PostMapping
	public List<Book> insertBook(@RequestBody Book book) {
		list.add(book);
		return list;
	}
}