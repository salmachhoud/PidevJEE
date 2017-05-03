package edu.esprit.pi.piPMT.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sponsor
 *
 */
@Entity

public class Sponsor implements Serializable {

	   
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	@ManyToMany
	List<Project>listproject;
	
	private static final long serialVersionUID = 1L;

	public Sponsor() {
		super();
	}  
	
	public List<Project> getListproject() {
		return listproject;
	}

	public void setListproject(List<Project> listproject) {
		this.listproject = listproject;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
