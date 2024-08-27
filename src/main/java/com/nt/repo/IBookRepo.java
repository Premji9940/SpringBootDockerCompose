package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Books;

public interface IBookRepo extends CrudRepository<Books, Integer>{

}
