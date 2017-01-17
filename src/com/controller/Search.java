package com.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.Product;
import com.model.RedisSession;
import com.model.SolrSearch;
import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;

public class Search extends HttpServlet{
 
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		try{		
		System.out.println("Entered Backend");
		String key = request.getParameter("key");
		System.out.println("------"+ key);
		if (key =="")
		{System.out.println("------index.jsp"+ key);
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
	        view.forward(request, response);
		}
	
	    else if (key != "")
      {
	    	System.out.println("------crct path"+ key);
    	  SolrSearch ss = new SolrSearch();
    	  List <Product> productlist2=ss.SolrData(key);
    	  System.out.println("------crct path"+ productlist2.size());
    	  request.setAttribute("products2", productlist2);
  		  
      }
	    
	    RequestDispatcher view = request.getRequestDispatcher("searchview.jsp");
        view.forward(request, response);
	}
	catch (Exception e) {
         e.printStackTrace();
        }
		
}
	
}
