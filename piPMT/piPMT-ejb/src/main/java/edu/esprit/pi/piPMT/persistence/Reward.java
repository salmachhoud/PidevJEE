package edu.esprit.pi.piPMT.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reward
 *
 */
@Entity

public class Reward implements Serializable {

	   
	@Id
	private int id;
	private String Title;
	private double point;
	@OneToOne
	private Task task;
	private static final long serialVersionUID = 1L;

	public Reward() {
		super();
	} 
	
	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getTitle() {
		return this.Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}   
	public double getPoint() {
		return this.point;
	}

	public void setPoint(double point) {
		this.point = point;
	}
   
}
