import java.sql.*;
	import com.mysql.jdbc.Driver;
public class Insert {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try
		{
			// 1step
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//2nd step
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="insert into employee_info values(190,'priya',20000,'f')";
		conn=DriverManager.getConnection(url);
		stmt=conn.createStatement();
		
		int insert=stmt.executeUpdate(sql);
		System.out.println(insert+ "insert success");
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
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	}

