package com.ustglobal.didemo;

import com.ustglobal.didemo.dao.I;
import com.ustglobal.didemo.util.Manager;

public class MainClass {
public static void main(String[] args) {
	
	Manager manager=new Manager();
	I i=manager.getI();
	i.m1();
	i.m2();
	i.m3();
	}
}
