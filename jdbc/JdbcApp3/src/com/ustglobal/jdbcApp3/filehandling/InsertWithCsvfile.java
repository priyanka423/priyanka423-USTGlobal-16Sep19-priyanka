package com.ustglobal.jdbcApp3.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithCsvfile {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="insert into employee_info values(?,?,?,?)";
		try(FileReader in=new FileReader("csv.txt");
				BufferedReader reader=new BufferedReader(in);
				Connection conn=DriverManager.getConnection(url);
				PreparedStatement pstmt=conn.prepareStatement(sql)){

			//reading the value from file

			while(reader.ready()) {
				String line=reader.readLine();
				String[] datas=line.split(",");

				// passing the data
				int id=Integer.parseInt(datas[0]);
				String name=datas[1];
				int sal=Integer.parseInt(datas[2]);
				String gender=datas[3];

				// set the data//
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, sal);
				pstmt.setString(4, gender);

				// execute the query//
				int count=pstmt.executeUpdate();
				System.out.println(count+"inserted successfully");
			}



		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

