package com.ustglobal.empapp;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;
public class App {
	public static void main(String[] args) {

		System.out.println("Press 1 to get all the data");
		System.out.println("Press 2 to insert the data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");

		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();

		switch(ch){

		case 1:

			//EmployeeDAOImpl impl=new EmployeeDAOImpl();
			EmployeeDAO dao=EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result=dao.getAllEmployee();

			for(EmployeeBean bean: result) {
				System.out.println(" Id :"+bean.getId());
				System.out.println("Name "+bean.getName());
				System.out.println("Sal "+bean.getSal());
				System.out.println("Gender"+bean.getGender());
			}
			break;


		case 2:

			EmployeeDAO impl2=EmployeeManager.getEmployeeDAO();
			int id=sc.nextInt();
			String name=sc.next();
			int sal=sc.nextInt();
			String gender=sc.next();
			EmployeeBean bean1=new EmployeeBean();
			bean1.setId(id);
			bean1.setName(name);
			bean1.setSal(sal);
			bean1.setGender(gender);
			int res=impl2.insertEmployeeData(bean1);
			System.out.println(res+ "Rows() Inserted");
			break;

		case 3:
			EmployeeDAO impl3=EmployeeManager.getEmployeeDAO();
			int id2=sc.nextInt();
			String name2=sc.next();
			int sal2=sc.nextInt();
			String gender2=sc.next();

			EmployeeBean bean2=new EmployeeBean();

			bean2.setId(id2);
			bean2.setName(name2);
			bean2.setSal(sal2);
			bean2.setGender(gender2);

			int res2=impl3.updateEmployeeData(bean2);
			System.out.println(res2 + "Row Updated");
			break;

		case 4:
			EmployeeDAO impl4=EmployeeManager.getEmployeeDAO();
			int id3=sc.nextInt();
			int res3=impl4.deleteEmployeeData(id3);
			System.out.println(res3 + "Row(s) deleted");
			break;

		case 5:
			//EmployeeDAOImpl impl2=new EmployeeDAOImpl();
			EmployeeDAO impl5=EmployeeManager.getEmployeeDAO();
			int id5=sc.nextInt();
			EmployeeBean result2=impl5.serchEmployeeData(id5);
			if(result2!=null) {
				System.out.println(" Id :"+result2.getId());
				System.out.println("Name "+result2.getName());
				System.out.println("Sal "+result2.getSal());
				System.out.println("Gender"+result2.getGender());

			}else {
				System.out.println("data not found");
			}
			break;
		}
	} //end if main
} //end of App class
