package edu.esprit.pi.piPMT.services;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.pi.piPMT.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
