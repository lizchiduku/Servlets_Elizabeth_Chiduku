package com.LizChiduku.web;

import java.io.IOException;
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
    	@WebServlet("/Home")
    	public class Home extends HttpServlet {
    	    private static final long serialVersionUID = 1L;
    	    public Home() {
    	        super();
    	    }
    	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	        // Sets the content type of the response
    	        response.setContentType("text/html");
    	        // writes the response
    	        PrintWriter out = response.getWriter();
    	        out.write("<h1>Hello World</h1>");
    	} 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
