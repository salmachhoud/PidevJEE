package edu.esprit.pi.piPMT.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Report
 *
 */
@Entity

public class Report implements Serializable {

	   
	@Id
	private int id;
	private String description;
	@OneToOne
	private Project project;
	private static final long serialVersionUID = 1L;

	public Report() {
		super();
	} 
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
