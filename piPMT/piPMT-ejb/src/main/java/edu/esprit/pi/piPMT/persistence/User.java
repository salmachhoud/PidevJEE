package edu.esprit.pi.piPMT.persistence;


import java.io.Serializable;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	   
	@Id
	@GeneratedValue
	
	private int id;
	private String username;
	private String email;
	private String firstname;
	private String lastname;
	private String role;

	private int phone;
	@ManyToMany
	List<Project>listproject;
	
	@ManyToMany
	List<Task>listtask;
	@ManyToMany
	List<TrainingSession>listTrainingSession;


   
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
@JsonIgnore
	public List<Project> getListproject() {
		return listproject;
	}

	public void setListproject(List<Project> listproject) {
		this.listproject = listproject;
	}
@JsonIgnore
	public List<TrainingSession> getListTrainingSession() {
		return listTrainingSession;
	}

	public void setListTrainingSession(List<TrainingSession> listTrainingSession) {
		this.listTrainingSession = listTrainingSession;
	}

	

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}   
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}   
	
	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}


	@JsonIgnore
	public List<Task> getListtask() {
		return listtask;
	}

	public void setListtask(List<Task> listtask) {
		this.listtask = listtask;
	}

	
   
}
