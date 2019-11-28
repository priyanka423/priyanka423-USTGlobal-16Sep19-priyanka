package com.ustglobal.jdbcapp3;

import java.io.FileReader;

import java.sql.*;
import java.util.Properties;

public class UpdateWithTryResource {
	public static void main(String[] args) {
		try(FileReader reader=new FileReader("text1.properties")){
			Properties prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url=prop.getProperty("url");
			String sql=prop.getProperty("update-query");
			try(Connection conn=DriverManager.getConnection(url,prop);
					PreparedStatement pstmt=conn.prepareStatement(sql)){
				String empid=args[0];
				int id=Integer.parseInt(empid);

				String name=args[1];

				String empsal=args[2];
				int sal=Integer.parseInt(empsal);

				String gender=args[3];

				pstmt.setInt(4, id);
				pstmt.setString(1, name);
				pstmt.setInt(2, sal);
				pstmt.setString(3,gender);
				int update=pstmt.executeUpdate();
				System.out.println(update+ "update success");

			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
