package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out=resp.getWriter();
		String id="";
		Cookie[] cookies=req.getCookies();
		if(cookies!=null) {
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id=cookie.getValue();
				}

			}
		}

		out.println("<html>");
		out.println("<body>");
		out.println("<fieldset align='center'>");
		out.println("<legend align='center'>Login</legend>");
		out.println("<form action='./login' method='post'>");
		out.println("<table align='center'>");
		out.println("<tr><td>Login-id:</td>");
		out.println("<td><input type='number' name='id' value='"+id+"'></td></tr>");
		out.println("<tr><td>Login-password:</td>");
		out.println("<td><input type='password' name='password'></td></tr>");
		out.println("<tr><td>Remember Me</td>");
		out.println("<td><input type='checkbox' value='checked' name='rememberme'></td></tr>");
		out.println("<tr><td><input type='submit' value='Login'></td>");
		out.println("<td><input type='reset' value='reset'></td></tr>");
		out.println("<tr><td><a href='./register.html'>Register</a></td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</fieldset>");
		out.println("</body>");
		out.println("</html>");

	} // end of doGet()

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);


	} // end of doPost()
} // end of LoginPageServlet
