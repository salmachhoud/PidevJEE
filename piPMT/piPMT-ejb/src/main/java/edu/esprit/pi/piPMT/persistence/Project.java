package edu.esprit.pi.piPMT.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;



/**
 * Entity implementation class for Entity: Project
 *
 */
@Entity

public class Project implements Serializable {

	   //sprite csss
	@Id
	@GeneratedValue
	
	private int id;
	private String name;
	private String description;
	private Date startdate;
	private Date enddate;
	private double cost;
	private String category;

private int numberofparticipants;
@ManyToMany(mappedBy="listproject")
List<User>listuser;
	@OneToOne(mappedBy="project")
	private  Report report;
	@ManyToMany(mappedBy="listproject")
	List<Sponsor>listsponsor;

	@OneToMany(mappedBy="project",cascade=CascadeType.ALL)
	List<Task>listtask;
	private static final long serialVersionUID = 1L;

	public List<User> getListuser() {
		return listuser;
	}
	public void setListuser(List<User> listuser) {
		this.listuser = listuser;
	}
	public Project() {
		super();
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
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getNumberofparticipants() {
		return numberofparticipants;
	}
	public void setNumberofparticipants(int numberofparticipants) {
		this.numberofparticipants = numberofparticipants;
	}
	public Report getReport() {
		return report;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	public List<Sponsor> getListsponsor() {
		return listsponsor;
	}
	public void setListsponsor(List<Sponsor> listsponsor) {
		this.listsponsor = listsponsor;
	}
	
	public List<Task> getListtask() {
		return listtask;
	}
	public void setListtask(List<Task> listtask) {
		this.listtask = listtask;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void affectTaskToProject(List<Task> tasks){
		
		for (Task c : tasks){
			c.setProject(this);
		}
		this.setListtask(tasks);
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + ", cost=" + cost
				+ ", category=" + category + ", numberofparticipants=" + numberofparticipants + "]";
	}
	
   
}
