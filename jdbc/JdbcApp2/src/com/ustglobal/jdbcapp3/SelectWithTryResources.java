package com.ustglobal.jdbcapp3;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Properties;

public class SelectWithTryResources {
	public static void main(String[] args) {
		try(FileReader reader=new FileReader("text1.properties")){
			Properties prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url=prop.getProperty("url");
			String sql=prop.getProperty("select-query");
			try(Connection conn=DriverManager.getConnection(url,prop);
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql)){
				while(rs.next()) {
					System.out.println("Id : "+rs.getInt("id"));
					System.out.println("Name : "+rs.getString("name"));
					System.out.println("Sal : "+rs.getInt("sal"));
					System.out.println("Gender : "+rs.getString("gender"));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
}

