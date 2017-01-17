package com.model;



import java.util.ArrayList;
import java.util.List;

import com.dao.Product;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;


public class CassandraSession 
{
	
	/** Cassandra Cluster. */
	    Cluster cluster;
	/** Cassandra Session. */
	    Session session;
	
	public Session getSession() {
		  cluster = Cluster.builder().addContactPoint("localhost").build();
		  session= cluster.connect("dev");
		  return session;
		}

	
public List<Product> getAlldata(List<String> cassandrapid){
		
	List<Product> productlist = new ArrayList<Product>();
	Session cassandraSession = null;
	try{
		
	
		 cassandraSession= getSession();
		for(String pid : cassandrapid){
			System.out.println(pid);
			ResultSet results = cassandraSession.execute("SELECT * FROM product where pdt_id="+Integer.parseInt(pid));
			
			Product product = new Product();
			for (Row row : results) 
			{
			
				product.setPdt_id(row.getInt("pdt_id"));
				 product.setAuthor(row.getString("author"));
				 product.setBook_name(row.getString("book_name"));
				 product.setFormat(row.getString("format"));
				 product.setLanguage(row.getString("language"));
				 product.setPages(row.getInt("pages"));
				 product.setPrice(row.getFloat("price"));
				 product.setPublisher(row.getString("publisher"));
				 product.setReviews(row.getString("reviews"));
				 product.setSynopsis(row.getString("synopsis"));
				 product.setCategory(row.getString("category"));
			
				productlist.add(product);
			
			}		
		}
	}catch(Exception e ){
		
	}finally{
		cassandraSession.close();
	}
		return productlist;
		
		
	}
	   public void close()
	   {
	      cluster.close();
	   }
}
