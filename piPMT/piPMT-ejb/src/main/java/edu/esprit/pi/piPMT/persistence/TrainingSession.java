package edu.esprit.pi.piPMT.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TrainingSession
 *
 */
@Entity

public class TrainingSession implements Serializable {

	   
	@Id
	@GeneratedValue
	private int id;
	private Date startdate;
	private Date enddate;
	private String name;
	private int teamnumber;
	@ManyToMany(mappedBy="listTrainingSession")
	List<User>listuser;
	
	private static final long serialVersionUID = 1L;

	public TrainingSession() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public int getTeamnumber() {
		return this.teamnumber;
	}

	public void setTeamnumber(int teamnumber) {
		this.teamnumber = teamnumber;
	}
	public List<User> getListuser() {
		return listuser;
	}
	public void setListuser(List<User> listuser) {
		this.listuser = listuser;
	}
	@Override
	public String toString() {
		return "TrainingSession [id=" + id + ", startdate=" + startdate + ", enddate=" + enddate + ", name=" + name
				+ ", teamnumber=" + teamnumber + "]";
	}

   
}
