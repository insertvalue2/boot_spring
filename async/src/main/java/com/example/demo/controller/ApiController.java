package com.example.demo.controller;

import java.util.concurrent.CompletableFuture;

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

	// 다른 쓰레드에서 실행을 시키고 결과를 반환 받는 형태 이다.
	@GetMapping("hello")
	public CompletableFuture<?> hello() {
		return asyncService.run();
	}
}
