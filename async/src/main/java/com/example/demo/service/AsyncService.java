package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {
	// 기다렸다가 실행에 흐름이 나가야 하지만 @Async 때문에 바로 진행 가능 하다.   
	@Async
	public void hello() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("thread sleep ...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
