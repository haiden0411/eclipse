package com.huawei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.huawei.entity.Book;
import com.huawei.repository.BookJapRepository;

@RestController()
public class BookController
{

	@Autowired
	private BookJapRepository bookJpaRepository;

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public Book addBook(@RequestBody String params)
	{
		Book book = new Book();
		// String title = params.getString("title");
		// String author = params.getString("author");
		// String description = params.getString("description");
		// System.out.println("title--" + title + "author--" + author + "description---"
		// + description);
		// book.setTitle(title);
		// book.setAuthor(author);
		// book.setDesciption(description);
		// bookJpaRepository.save(book);

		// 用getBean的方式
		Gson gson = new Gson();

		book = gson.fromJson(params, Book.class);
		// book = JSONObject.parseObject(params, Book.class);
		bookJpaRepository.save(book);
		return book;
	}

}
