package com.kitri.hello3;

public class HelloServiceKor implements HelloService {

	private HelloDao helloDao;
	
	public HelloServiceKor(HelloDao helloDao) {
		this.helloDao = helloDao;
	}
	
//	public void setHelloDao(HelloDao helloDao) {
//		this.helloDao = helloDao;
//	}

//	public HelloServiceKor() {
//		System.out.println("HelloServiceKor 안녕하세요!!!!!");
//	}
	
	public String hello(String name) {
		return name + "안녕하세요!!\n" + helloDao.getGreeting();
	}
	
}
















