package com.la.ButtonCounter.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Counter
 */
@WebServlet("/Counter")
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int clicks = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Counter() {
        super();
    }
    
    protected void addClick() {
    	clicks++;
    }
    
    protected int getClicks() {
    	return clicks;
    }
    
	
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer clicks = (Integer) session.getAttribute("clicks");
		if (clicks == null) {
			session.setAttribute("clicks", 0);
		} else {
			Integer clicks1 = (Integer) session.getAttribute("clicks");
			clicks1++;
			session.setAttribute("clicks", clicks1);
		}
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);
	}
    
    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession();

        if (session.isNew()) {
        	session.setAttribute("clicks", clicks);
        } 
        else {
        	addClick();
        	session.setAttribute("clicks", clicks);       	
        }
        
        // flaming bananas magic happens here ...
        
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/counter.jsp");
        view.forward(request, response);
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
