package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.webapp.util.EmployeeDaoManager;

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);
		if(session!=null) {
			String pass=req.getParameter("password");
			String confirmPass=req.getParameter("confirmpassword");

			if(pass.equals(confirmPass)) {
				EmployeeInfo info=(EmployeeInfo)session.getAttribute("info");
				EmployeeDAO dao=EmployeeDaoManager.getEmployeeDAO();
				dao.changePassword(info.getId(), pass);
				RequestDispatcher dispatcher=req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);

			}else {

				// ... for jsp............//
				String msg="Password Not Matching";
				req.setAttribute("msg", msg);
				RequestDispatcher dispatcher=req.getRequestDispatcher("/changepassword.jsp");
				dispatcher.forward(req, resp);
				//...................................//

				//				PrintWriter out=resp.getWriter();
				//				out.println("<html>");
				//				out.println("<h4> Password Not Matching");
				//				out.println("</html>");
				//				RequestDispatcher dispatcher=req.getRequestDispatcher("/changepassword.html");
				//				dispatcher.include(req, resp);
			}

		}else {
			//			RequestDispatcher dispatcher=req.getRequestDispatcher("/login.html");
			RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}


	}// end of doPost()

} // end of ChangePasswordServlet
