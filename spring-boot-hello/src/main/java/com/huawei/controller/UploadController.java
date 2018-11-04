package com.huawei.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController
{
	Map<String, Object> result = new HashMap<>();

	@RequestMapping("/uploadAttach")
	public Map<String, Object> upload(@RequestParam("attach") MultipartFile[] file)
			throws IllegalStateException, IOException
	{

		// System.out.println("文件原名：" + file.getOriginalFilename());
		// System.out.println("文件类型:" + file.getContentType());
		// file.transferTo(new File("d:/test/" + file.getOriginalFilename()));

		for (MultipartFile multipartFile : file)
		{
			if (multipartFile != null && !multipartFile.getOriginalFilename().equals(""))
			{
				System.out.println("文件原名：" + multipartFile.getOriginalFilename());
				System.out.println("文件名：" + multipartFile.getName());
				System.out.println("文件类型:" + multipartFile.getContentType());
				multipartFile.transferTo(new File("d:/test/" + multipartFile.getOriginalFilename()));
			}
		}
		result.put("success", true);
		return result;
	}
}
