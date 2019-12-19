package com.ustglobal.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {


	//..................... for date...............//
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class,editor);

	}
	//...........................................................//

	//............... giving the request..................//
	/*
	 * @RequestMapping(path="/hello") public String hello(ModelMap map) {
	 * map.addAttribute("msg","Hello World"); return "index"; }
	 */

	//..............  passing the parameter ...................//

	@RequestMapping(path="/hello")
	public String hello(@RequestParam("name")String name,
			@RequestParam("id") int id,
			ModelMap map) {
		map.addAttribute("msg","Hello World");
		map.addAttribute("name",name);
		map.addAttribute("id",id);
		return "index";
	}

	// ............. passing the variable ....................//

	@RequestMapping(path="/hi/{name}/{id}") 	// here it givng the path
	public String hi(@PathVariable("name")String name, // here it will stored the variable
			@PathVariable("id") int id,
			HttpServletRequest request) {
		request.setAttribute("msg","Hello World");
		request.setAttribute("name",name);
		request.setAttribute("id",id);
		return "index";
	}

	//................ for form.jsp ...............//

	@RequestMapping(path="/form") // go to the only the  form page
	public String formPage() {
		return "form";
	}


	/*
	 * @RequestMapping(path="/form", method=RequestMethod.POST) // here it will
	 * accepting the form request public String form(int id,String name, // here it
	 * will give the same variable name which are declared in the form.jsp String
	 * password, String gender, ModelMap map) { map.addAttribute("id",id);
	 * map.addAttribute("name",name); map.addAttribute("password",password);
	 * map.addAttribute("gender",gender); return "formoutput";
	 * 
	 * }
	 */

	@RequestMapping(path="/form", method=RequestMethod.POST) // here it will accepting the form request 
	public String form(Employee employee, // here it will give the same variable  name which are declared in the form.jsp
			ModelMap map) {
		map.addAttribute("id",employee.getId());
		map.addAttribute("name",employee.getName());
		map.addAttribute("password",employee.getPassword());
		map.addAttribute("gender",employee.getGender());
		map.addAttribute("doj",employee.getDoj());
		return "formoutput";

	}

	//.............. for create cookie .............................//

	@RequestMapping(path="create-cookie")
	public String createCookie(ModelMap map,
			HttpServletResponse response) {

		Cookie cookie=new Cookie("name","Divya");
		response.addCookie(cookie);
		return "createcookie";
	}

	//....................... for reading the cookie.......................//
	
	/*
	 * @RequestMapping(path="/read-cookie") public String readCookie(ModelMap map,
	 * 
	 * @CookieValue (name="name",required=false )String name) {
	 * 
	 * map.addAttribute("name", name); return "readcookie";
	 * 
	 * }
	 */
	
	@RequestMapping(path="/read-cookie")
	public String readCookie(ModelMap map,
			@CookieValue("name")String name) {
		
		map.addAttribute("name", name);
		return "readcookie";

	}
	
	
	//..................... redirect the url .........................//
	
	@RequestMapping(path="/redirect")
	public String redirect() {
		return "redirect:https://www.google.com";
	}
	//.........................................................................//

	//............................... for forwarding the request to hello ..................//
	
	@RequestMapping(path="/forward")
		public String forward() {
			return "forward:/hi/pri/1";
		}
	
	
	
	
	//......................... giving the request ...............//
	/*
	 * @RequestMapping(path="/hi") public String hi(HttpServletRequest request) {
	 * request.setAttribute("msg","Hello World"); return "index"; }
	 */
}
