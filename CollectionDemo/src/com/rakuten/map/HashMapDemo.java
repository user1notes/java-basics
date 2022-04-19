package com.rakuten.map;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Book> books = new HashMap<>();
		
		for(int i=0;i<10;i++) {
			Book book = new Book();
			book.setTitle("title "+i);
			book.setPrice((float)Math.random() * 1000);
			books.put("Key "+i, book);
		}
		System.out.println(books.get("Key 0").getTitle());
		System.out.println(books.get("Key 1"));
		
		System.out.println(books);
	}
	
	
}
