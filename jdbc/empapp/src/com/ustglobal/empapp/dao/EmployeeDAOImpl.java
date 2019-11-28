package com.ustglobal.empapp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {
	public List<EmployeeBean> getAllEmployee() {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			ArrayList<EmployeeBean> result=new ArrayList<EmployeeBean>();
			while(rs.next()) {
				EmployeeBean bean=new EmployeeBean();
				int id=rs.getInt("id");
				bean.setId(id);
				String name=rs.getString("name");
				bean.setName(name);
				int sal=rs.getInt("sal");
				bean.setSal(sal);
				String gender=rs.getString("gender");
				bean.setGender(gender);
				result.add(bean);
				//			System.out.println(" Id :"+rs.getInt("id"));
				//			System.out.println("Name "+rs.getString("name"));
				//			System.out.println("Sal "+rs.getInt("sal"));
				//			System.out.println("Gender"+rs.getString("gender"));
			}
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
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
			}catch(Exception e) {
				e.printStackTrace();
			}
		} //end of the try-catch-finally
	} //end of getAllEmployee



	public EmployeeBean serchEmployeeData(int id) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();

			//			ArrayList<EmployeeBean> result2=new ArrayList<EmployeeBean>();
			if(rs.next()) {
				EmployeeBean bean=new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}else {
				return null;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

	public int insertEmployeeData(EmployeeBean bean) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="insert into employee_info values(?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,bean.getId());

			pstmt.setString(2,bean.getName());

			pstmt.setInt(3,bean.getSal());

			pstmt.setString(4,bean.getGender());

			int count=pstmt.executeUpdate();
			return count;

		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}


	}

	public int updateEmployeeData(EmployeeBean bean) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="update employee_info set name=?, sal=?, gender=? where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbs.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);

			pstmt.setInt(4,bean.getId());

			pstmt.setString(1,bean.getName());

			pstmt.setInt(2,bean.getSal());

			pstmt.setString(3,bean.getGender());

			int count=pstmt.executeUpdate();
			return count;


		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

	public int deleteEmployeeData(int id) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="delete from employee_info where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbs.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);

			pstmt.setInt(1,id);
			int count=pstmt.executeUpdate();
			return count;

		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}



}

