package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AsyncService;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private AsyncService asyncService;
	
	@GetMapping("hello")
	public String hello() {
		asyncService.hello();
		System.out.println("method end");
		return "hello";
	}
	
	
}
