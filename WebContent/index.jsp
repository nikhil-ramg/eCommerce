 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
	position: absolute;
    width: 100%;
    bottom: -210px;
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

ul#disp {
    list-style: none;
    float: left;
    display: inline-flex;
    margin-left: 135px;
    }
    ul#disp2 {
    list-style: none;
    float: left;
    display: inline-flex;
    margin-left: 135px;
    }

*.a:hover {
	color: blue;
}

p.left {
    margin-left: 476px;
}
	</style>
	
</head>
<body>
	

<div class="shell">
	
	<div id="header">
		<div id="logo"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/usflogo.png" href="/eCommerce/"/>
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

			<div class="home">
				<div id="homepage">
					<ul id="disp">
					    <li><a href="/eCommerce/SearchProduct?pdt_id=1"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/1.png" alt="" /></a></li>
					    <li><a href="/eCommerce/SearchProduct?pdt_id=2"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/2.png" alt="" /></a></li>
					    <li><a href="/eCommerce/SearchProduct?pdt_id=8"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/8.png" alt="" /></a></li>
					    <li><a href="/eCommerce/SearchProduct?pdt_id=10"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/10.png" alt="" /></a></li>
					    <li><a href="/eCommerce/SearchProduct?pdt_id=7"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/7.png" alt="" /></a></li>
					    </ul>
					    <ul id="disp2">
					    <li><a href="/eCommerce/SearchProduct?pdt_id=3"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/3.png" alt="" /></a></li>
					    <li><a href="/eCommerce/SearchProduct?pdt_id=4"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/4.png" alt="" /></a></li>
					    <li><a href="/eCommerce/SearchProduct?pdt_id=5"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/5.png" alt="" /></a></li>
					    <li><a href="/eCommerce/SearchProduct?pdt_id=6"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/6.png" alt="" /></a></li>
					    <li><a href="/eCommerce/SearchProduct?pdt_id=9"><img src="http://res.cloudinary.com/rahulrocky2020/image/upload/v1480213192/9.png" alt="" /></a></li>
					</ul>
				</div>
				
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