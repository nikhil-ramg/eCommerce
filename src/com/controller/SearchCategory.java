package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Product;
import com.model.SolrSearch;

public class SearchCategory extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		System.out.println("NEW METHOD");
		String categoryName = request.getParameter("Category");
		 SolrSearch ss = new SolrSearch();
   	     List <Product> productlist2=ss.getSolrCategoryData(categoryName);
   	  System.out.println("------crct path"+ productlist2.size());
	  request.setAttribute("products2", productlist2);
	  RequestDispatcher view = request.getRequestDispatcher("searchview.jsp");
      view.forward(request, response);
	}
	

}
