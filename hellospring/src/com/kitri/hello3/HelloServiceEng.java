package com.kitri.hello3;

public class HelloServiceEng implements HelloService {

	public HelloServiceEng() {
		System.out.println("HelloServiceEng 안녕하세요!!!!!");
	}
	
	public String hello(String name) {
		return "Hello " + name + "!!";
	}
	
}
