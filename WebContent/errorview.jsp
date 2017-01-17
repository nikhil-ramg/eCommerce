<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<%@ page import="com.dao.Product"%>
<%@ page import="org.apache.taglibs.standard.tag.common.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>Book Store</title>

	<style>
		#header img{
    height: 50px;
    background: #f8f7db;
    padding: 2px;
    float: left;
}

.search-submit {
    width: 80px;
    color: #fff;
    height: 37px;
    display: inline-block;
    line-height: 26px;
    cursor: pointer;
    border-radius: 6px;
    font-size: 15px;
    background-image: linear-gradient(#80cb92, #3ca957);
    box-shadow: inset 0 0 3px #daf0e0;
    border: 1px solid #2c6d3c;
}

body {
    background: #f8f7db;
    font-family: "Trebuchet MS", Arial, sans-serif;
    font-size:12px;
    line-height:16px;
    color: #23a079;
}

#header{ 
    height: 58px; 
    padding: 4px; 
    background: -webkit-linear-gradient(top, #23a079, #0f7254);
    }

    input#key.field {
    width: 70%;
    height: 27px;
    padding: 5px;
    font-size: 16px;
    border: grey 1px solid;
    border-radius: 8px;
    margin-left: 110px;
}

#heading{
	 float: left;
    color: #f8f7db;
    font-size: 28px;
    padding-top: 15px;
    margin-left: 300px;
}

.box-content a {
    text-decoration: none;
    color: #23a079;
    font-size: 14px;
}


.box.search {
    margin-top: 10px;
}

.box-content ul li {
    text-decoration: none;
    list-style: none;
    padding: 3px;
    padding-top: 8px;
    padding-bottom: 8px;
}

#footer { 
	height:51px; 
	background:#23a079; 
	white-space:nowrap; 
	line-height:50px; 
	padding:0 15px; 
	color:#f8f7db; 
	margin-top:10px;
}

#footer a{ 
	color:#f8f7db; 
	text-decoration: none;
}
#footer a:hover{ 
	color:#000;
}
#footer span{ 
	padding:0 2px;
}

#homepage ul li img {
    height: 225px;
    width: 160px;
    padding-right: 20px;
}

div#content {
    width: 10%;
    display: inline-block;
    float: left;
}


*.a:hover {
	color: blue;
}

p.left {
    margin-left: 476px;
}

	</style>
	</style>
	

	<script src="js/jquery-1.4.1.min.js" type="text/javascript"></script>	
	<script src="js/jquery.jcarousel.pack.js" type="text/javascript"></script>	
	<script src="js/jquery-func.js" type="text/javascript"></script>	

	
</head>
<body>
	

<div class="shell">
	
	
	<div id="header">
		<div id="logo"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/usflogo.png" href="http://localhost:8080/eCommerce/"/>
<div id="heading">Book Store</div>
		</div>	
</div>
	
	<div id="main">
	
		
			<div class="box search">
				
				<div class="box-content">
					<form action="Search" method="post">
						
						<input type="text" class="field" name="key" placeholder="Enter Search" id="key" />		
						<input type="submit" class="search-submit" value="Search" />
					</form>
				</div>
			</div>
			
		<div id="content">
		
		
			<div class="box categories">
				<h2>Categories</h2>
				<div class="box-content">
					<ul>
					    <li><a href="/eCommerce/SearchCategory?Category=Thriller">Thriller</a></li>
					    <li><a href="/eCommerce/SearchCategory?Category=Romance">Romance</a></li>
					    <li><a href="/eCommerce/SearchCategory?Category=Fantasy">Fantasy</a></li>
					    <li><a href="/eCommerce/SearchCategory?Category=Sci Fi">Sci Fi</a></li>
					</ul>
				</div>
				
				
			</div>
		

			<div class="box">							
             <h3>Please enter Item to search..</h3>
           </div>
           </div>
		
		
	
	</div>

	<div id="footer">
		<p class="left">
			<a href="http://localhost:8080/eCommerce/">Home</a>
			<span>|</span>
			<a href="#">Support</a>
			<span>|</span>
			<a href="#">About Us</a>
			<span>|</span>
			<a href="#">Copyrights</a>
		</p>
	</div>

	
</div>	

	
	
</body>
</html>