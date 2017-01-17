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

public class SearchProduct extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		System.out.println("NEW METHOD");
		String Product_Id = request.getParameter("pdt_id");
		System.out.println("PRODUCT ID"+ Product_Id);
		RedisSession rs= new RedisSession();
		List<String> pidlist= new ArrayList<String>();
		pidlist.add(Product_Id);
		List<Product> productlist2=rs.cachedprod(pidlist);
   	  System.out.println("------crct path"+ productlist2.size());
	  request.setAttribute("products2", productlist2);
	  RequestDispatcher view = request.getRequestDispatcher("product.jsp");
      view.forward(request, response);
		
		
	}
	
	
}
