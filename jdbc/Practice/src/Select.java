import java.sql.*;
import com.mysql.jdbc.Driver;
public class Select {
public static void main(String[] args) {
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try
	{
		// 1step
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	
	//2nd step
	String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	String sql="select * from employee_info";
	conn=DriverManager.getConnection(url);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()) {
		System.out.println("Id is: "+rs.getInt("id"));
		System.out.println("Name is "+rs.getString("name"));
		System.out.println("Sal is"+rs.getInt("sal"));
		System.out.println("Gender is: "+rs.getString("gender"));
	}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
}
