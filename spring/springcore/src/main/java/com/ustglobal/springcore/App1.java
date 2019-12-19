package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;

public class App1 {
	public static void main(String[] args) {

	ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
	
	Book book=context.getBean(Book.class);
	System.out.println(book.getName());
	System.out.println(book.getPrice());
	
	System.out.println("*************************");
	
	Author author=context.getBean(Author.class);
	System.out.println(author.getName());
	System.out.println(author.getPername());
	
	
}
}