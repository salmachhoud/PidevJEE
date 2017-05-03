package edu.esprit.pi.piPMT.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entity implementation class for Entity: Task
 *
 */
@Entity

public class Task implements Serializable {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date startdate;
	private Date enddate;
	private int numberofparticipants;
	
	@ManyToMany(mappedBy="listtask")

	
	private List<User>listuser;
	@OneToOne(mappedBy="task")
	private Reward reward ;
	
	
	@ManyToOne
	private Project project;
	private static final long serialVersionUID = 1L;

	public Task() {
		super();
	} 
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@JsonIgnore
	public List<User> getListuser() {
		return listuser;
	}

	public void setListuser(List<User> listuser) {
		this.listuser = listuser;
	}

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
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
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}   
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public int getNumberofparticipants() {
		return numberofparticipants;
	}

	public void setNumberofparticipants(int numberofparticipants) {
		this.numberofparticipants = numberofparticipants;
	} 
	
	
	
	
	}

