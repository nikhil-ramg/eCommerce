package com.dao;


public class Product extends Thread{

private int pdt_id;
private String author;
private String book_name;
private String format;
private String language;
private int pages;
private float price;
private String publisher;
private String reviews;
private String synopsis;
private String category;

public Product(int pdt_id, String author, String book_name, String format,
String language, int pages, float price, String publisher,
String reviews, String synopsis,String category) {
super();
this.pdt_id = pdt_id;
this.author = author;
this.book_name = book_name;
this.format = format;
this.language = language;
this.pages = pages;
this.price = price;
this.category= category;
this.publisher = publisher;
this.reviews = reviews;
this.synopsis = synopsis;
}

public int getPdt_id() {
return pdt_id;
}

public void setPdt_id(int pdt_id) {
this.pdt_id = pdt_id;
}

public String getAuthor() {
return author;
}

public void setAuthor(String author) {
this.author = author;
}

public String getBook_name() {
return book_name;
}

public void setBook_name(String book_name) {
this.book_name = book_name;
}

public String getFormat() {
return format;
}

public void setFormat(String format) {
this.format = format;
}

public String getLanguage() {
return language;
}

public void setLanguage(String language) {
this.language = language;
}

public int getPages() {
return pages;
}

public void setPages(int pages) {
this.pages = pages;
}

public double getPrice() {
return price;
}

public void setPrice(float price) {
this.price = price;
}

public String getPublisher() {
return publisher;
}

public void setPublisher(String publisher) {
this.publisher = publisher;
}

public String getReviews() {
return reviews;
}

public void setReviews(String reviews) {
this.reviews = reviews;
}

public String getSynopsis() {
return synopsis;
}

public void setSynopsis(String synopsis) {
this.synopsis = synopsis;
}

public Product() {
super();
// TODO Auto-generated constructor stub
}
public Product(Runnable target, String name) {
super(target, name);
// TODO Auto-generated constructor stub
}
public Product(Runnable target) {
super(target);
// TODO Auto-generated constructor stub
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}
}