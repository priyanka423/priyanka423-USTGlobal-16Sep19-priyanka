package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;

public class LifeCycleClass1 {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans1sss.xml");
	
	Book book=context.getBean(Book.class);
	System.out.println(book.getName());
	System.out.println(book.getPrice());
	context.close();
}
}
