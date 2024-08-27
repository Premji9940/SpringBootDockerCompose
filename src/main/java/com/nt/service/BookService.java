package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Books;
import com.nt.repo.IBookRepo;

@Service
public class BookService {
	@Autowired public IBookRepo repo;
	
	
	//1.save	
	public String save(Books b) {
		repo.save(b);		
		return "Book Saved";
	}

}
