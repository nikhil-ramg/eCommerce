package com.model;


import org.apache.solr.client.solrj.impl.HttpSolrServer;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

import com.dao.Product;

public class SolrSearch {

	public List<Product> SolrData( String str) 
	{
		System.out.println("SOLR CODE");
	
		List<Product> productlist=new ArrayList<Product>();
		HttpSolrServer solr = new HttpSolrServer("http://localhost:8983/solr/gettingstarted");
		
	    SolrQuery query = new SolrQuery();
	    query.setQuery(str);
	   
	     query.setRequestHandler("/select");
	    query.set("defType", "edismax");
	    query.set("wt", "json");
	    query.set("indent", true);
	    RedisSession rs=null;
try{
	
	 rs= new RedisSession();

	    QueryResponse response = solr.query(query);
	    SolrDocumentList results = response.getResults();
	    System.out.println("SOLR SIZE"+ results.size());
	    List<String> pidlist= new ArrayList<String>();
	    
	    for (int i = 0; i < results.size(); ++i) 
	    { 	
	    	String bookId=String.valueOf(results.get(i).getFieldValue("pdt_id"));
	    	bookId= bookId.substring(1, bookId.indexOf("]"));
	    	pidlist.add(bookId);
	     }
	    System.out.println("SOLR SIZE"+ results.size());
	    productlist= rs.cachedprod(pidlist);
	  
		
	}catch(Exception e ){
	
	System.out.println(e.toString());
 }
return productlist;	
}

	public List<Product> getSolrCategoryData(String str) {
		System.out.println("SOLR CODE");
		
		List<Product> productlist=new ArrayList<Product>();
		HttpSolrServer solr = new HttpSolrServer("http://localhost:8983/solr/gettingstarted");
		
	    SolrQuery query = new SolrQuery();
	    query.setQuery(str);
	     query.setRequestHandler("/select");
	    query.set("defType", "edismax");
	    query.set("wt", "json");
	    query.set("indent", true);
	    try{
	    	RedisSession rs= new RedisSession();
	    	    QueryResponse response = solr.query(query);
	    	    SolrDocumentList results = response.getResults();
	    	    System.out.println("SOLR SIZE"+ results.size());
	    	    List<String> pidlist= new ArrayList<String>();
	    	    
	    	    for (int i = 0; i < results.size(); ++i) 
	    	    { 	
	    	    	String bookId=String.valueOf(results.get(i).getFieldValue("pdt_id"));
	    	    	bookId= bookId.substring(1, bookId.indexOf("]"));
	    	    	pidlist.add(bookId);
	    	     }
	    	    System.out.println("SOLR SIZE"+ results.size());
	    	    productlist= rs.cachedprod(pidlist);
	    	  
	    		
	    	}catch(Exception e ){
	    	
	    	System.out.println(e.toString());
	     }
	    
		return productlist;
	}
	

}

