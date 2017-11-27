package com.la.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get the value for the query parameter
        String fName = request.getParameter("fName");
        if (fName == null) fName = "Unknown";
        String lName = request.getParameter("lName");
        if (lName == null) lName = "Unknown";
        String favLang = request.getParameter("favLang");
        if (favLang == null) favLang = "Unknown";
        String homeTown = request.getParameter("homeTown");
        if (homeTown == null) homeTown = "Unknown";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome " + fName + " " + lName + ", Ninja!!1</h1>");
        out.write("<h3>Favorite Language: " + favLang + "</h3>");
        out.write("<h3>Hometown: " + homeTown + "</h3>");        
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
