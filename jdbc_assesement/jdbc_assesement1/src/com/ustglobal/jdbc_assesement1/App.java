package com.ustglobal.jdbc_assesement1;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.jdbc_assesement1.dao.MobileDAO;
import com.ustglobal.jdbc_assesement1.dto.MobileBean;
import com.ustglobal.jdbc_assesement1.util.MobileManager;
public class App {

	public void firstFunc() {
		System.out.println("\nPress 1 to show all the contacts");
		System.out.println("Press 2 to search for contact(using name)");
		System.out.println("Press 3 to operate on contact");

		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		App obj = new App();
		obj.callFunc(ch);
	}
	public void callFunc(int calling) {
		App obj = new App();
		Scanner sc = new Scanner(System.in);
		switch(calling){

		case 1:
			MobileDAO dao=MobileManager.getMobileDAO();
			List<MobileBean> result=dao.getAllContact();

			for(MobileBean bean: result) {
				System.out.println("Name "+bean.getName());
				System.out.println("Number "+bean.getNumber());
				System.out.println("Group"+bean.getGroups());

			}
			obj.firstFunc();
			break;


		case 2:
			MobileDAO impl5=MobileManager.getMobileDAO();
			String id5=sc.next();
			MobileBean result2=impl5.searchData(id5);
			if(result2!=null) {
				System.out.println("Number "+result2.getNumber());
				System.out.println("Group "+result2.getGroups());
				System.out.println("\npress 1 to call");
				System.out.println("press 2 to message");
				System.out.println("press 3 to go back to the main menu");
				int call =0;
				int inCall;
				String message;
				call= sc.nextInt();
				switch(call) {
				case 1:  
					System.out.println("Calling......");
					System.out.println("Press 1 to end the call");
					inCall=sc.nextInt();
					if(inCall==1) {
						System.out.println("Call ended");
						obj.firstFunc();
					}
					else {
						System.out.println("Invalid input");
						obj.firstFunc();
					}
					break;
				case 2: 
					System.out.println("enter the message");
					sc.next();
					System.out.println("Sending message....\n");
					obj.firstFunc();
					break;
				case 3: 
					obj.firstFunc();
					break;
				}

			}else {
				System.out.println("data not found");
			}
			break;


		case 3:
			System.out.println("press 1 to add contact");
			System.out.println("press 2 to delete contact");
			System.out.println("press 3 to edit the contact");
			Scanner sc1=new Scanner(System.in);
			int ch1=sc.nextInt();
			switch(ch1) {

			case 1:
				MobileDAO impl2=MobileManager.getMobileDAO();
				String name=sc1.next();
				int number=sc1.nextInt();
				String groups=sc1.next();
				MobileBean bean1=new MobileBean();
				bean1.setName(name);
				bean1.setNumber(number);
				bean1.setGroups(groups);
				int res=impl2.insertContactData(bean1);
				System.out.println(res+ "Rows() Inserted");
				obj.firstFunc();
				break;

			case 2:
				MobileDAO impl4=MobileManager.getMobileDAO();
				String name3=sc1.next();
				int res3=impl4.deleteMobileData(name3);
				System.out.println(res3 + "Row(s) deleted");
				obj.firstFunc();
				break;
				//				
			case 3:
				MobileDAO impl6=MobileManager.getMobileDAO();
				String name2=sc1.next();
				int number2=sc1.nextInt();
				String groups2=sc1.next();

				MobileBean bean2=new MobileBean();

				bean2.setName(name2);
				bean2.setNumber(number2);
				bean2.setGroups(groups2);

				int res2=impl6. updateMobileData(bean2);
				System.out.println(res2 + "Row Updated");
				obj.firstFunc();
				break;

			}
		}

	}
	public static void main(String[] args) {

		App objs = new App();
		objs.firstFunc();

	} //end if main

}//end of App class