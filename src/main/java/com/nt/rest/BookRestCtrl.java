package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Books;
import com.nt.service.BookService;

@RestController
public class BookRestCtrl {
	
	@Autowired BookService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Books b){		
		return new ResponseEntity<>(service.save(b),HttpStatus.OK);
	}

}
