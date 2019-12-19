package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigurationClass;
import com.ustglobal.springcore.config.ConfigurationClass1;
import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class AnnotationApp1 {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass1.class);
	Book book=context.getBean(Book.class);
	System.out.println(book.getAuthor());
	System.out.println(book.getName());
	System.out.println(book.getPrice());
	
	System.out.println("********************************");
	
	Author author=context.getBean(Author.class);
	System.out.println(author.getName());
	System.out.println(author.getPername());
	context.close();
}
}
