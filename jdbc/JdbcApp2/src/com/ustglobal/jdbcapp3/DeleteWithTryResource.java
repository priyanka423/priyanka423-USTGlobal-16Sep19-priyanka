package com.ustglobal.jdbcapp3;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class DeleteWithTryResource {
	public static void main(String[] args) {
		try(FileReader reader=new FileReader("text1.properties")){
			Properties prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url=prop.getProperty("url");
			String sql=prop.getProperty("delete-query");
			try(Connection conn=DriverManager.getConnection(url,prop);
					PreparedStatement pstmt=conn.prepareStatement(sql)){

				pstmt.setInt(1, Integer.parseInt(args[0]));
				int delete=pstmt.executeUpdate();

				System.out.println(delete+ "delete success");
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

