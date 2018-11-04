package com.huawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huawei.entity.Book2;
import com.huawei.repository.ReadingListRepository;

@Controller
@RequestMapping("/")
@ConfigurationProperties(prefix = "amazon")
public class ReadingListController
{
	@Autowired
	private ReadingListRepository readingListRepository;

	private String associateId;

	public String getAssociateId()
	{
		return associateId;
	}

	public void setAssociateId(String associateId)
	{
		this.associateId = associateId;
	}

	public ReadingListController(ReadingListRepository readingListRepository)
	{
		this.readingListRepository = readingListRepository;
	}

	@RequestMapping(value = "{reader}", method = RequestMethod.GET)
	public String readerBooks(@PathVariable("reader") String reader, Model model)
	{
		List<Book2> readingList = readingListRepository.findByReader(reader);
		if (readingList != null)
		{
			model.addAttribute("books", readingList);
		}
		return "readingList";
	}

	@RequestMapping(value = "{reader}", method = RequestMethod.POST)
	public String addToReadingList(@PathVariable("reader") String reader, Book2 book)
	{
		book.setReader(reader);
		readingListRepository.save(book);
		return "redirect:/{reader}";
	}

}
