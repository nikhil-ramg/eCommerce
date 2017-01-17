package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;
import com.dao.Product;
public class RedisSession 
{
	Jedis jedis = new Jedis("localhost");
	
	CassandraSession node = new CassandraSession();

	public  List<Product> cachedprod(List<String> pid) {
	
		
		Map<String, String> ProdHashMap = new HashMap <String, String> ();
		List<Product> productlist = new ArrayList<Product>();
		List<String> cassandrapid = new ArrayList<String>();
		
		for ( String member : pid)
		{
			 if (jedis.exists("pdt_id:"+member))
			 { 	 
				 Product product = new Product(); 
				 ProdHashMap = jedis.hgetAll("pdt_id:"+member);
				 product.setPdt_id(Integer.parseInt(ProdHashMap.get("pdt_id")));
				 product.setCategory(ProdHashMap.get("category"));
				 product.setAuthor(ProdHashMap.get("author"));
				 product.setBook_name(ProdHashMap.get("book_name"));
				 product.setFormat(ProdHashMap.get("format"));
				 product.setLanguage(ProdHashMap.get("language"));
				 product.setPages(Integer.parseInt(ProdHashMap.get("pages")));
				 product.setPrice(Float.parseFloat(ProdHashMap.get("price")));
				 product.setPublisher(ProdHashMap.get("publisher"));
				 product.setReviews(ProdHashMap.get("reviews"));
				 product.setSynopsis(ProdHashMap.get("synopsis"));
				 
				
				 
				 productlist.add(product);
				 
			}
			 else{
					cassandrapid.add(member);
				 }
			
			
		}
		
		if(cassandrapid.size()>0 )
		{
			List<Product> pdli = node.getAlldata(cassandrapid);
			productlist.addAll(pdli);
			for( Product pd : pdli)
			{
				ProdHashMap.put("pdt_id", String.valueOf(pd.getPdt_id()));
				ProdHashMap.put("author", String.valueOf(pd.getAuthor()));
				ProdHashMap.put("book_name", String.valueOf(pd.getBook_name()));
				ProdHashMap.put("format", String.valueOf(pd.getFormat()));
				ProdHashMap.put("language", String.valueOf(pd.getLanguage()));
				ProdHashMap.put("pages", String.valueOf(pd.getPages()));
				ProdHashMap.put("price", String.valueOf(pd.getPrice()));
				ProdHashMap.put("publisher", String.valueOf(pd.getPublisher()));
				ProdHashMap.put("reviews", String.valueOf(pd.getReviews()));
				ProdHashMap.put("synopsis", String.valueOf(pd.getSynopsis()));
				ProdHashMap.put("category", String.valueOf(pd.getCategory()));
				 jedis.hmset("pdt_id:" + pd.getPdt_id(), ProdHashMap);	
				 jedis.expire("pdt_id:"+pd.getPdt_id(), 20);	
			}
				
			node.close(); 	
			
		}
		  
		  		return productlist;
		
	}
	
}
