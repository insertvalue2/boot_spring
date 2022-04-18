package com.example.demo.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

	public CompletableFuture<?> run() {
		return new AsyncResult<String>(hello()).completable();
	}

	@Async
	public String hello() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("thread sleep ...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return "async hello";

	}
}
