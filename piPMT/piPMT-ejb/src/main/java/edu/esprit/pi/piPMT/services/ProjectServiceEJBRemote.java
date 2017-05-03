package edu.esprit.pi.piPMT.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pi.piPMT.persistence.Project;
@Remote
public interface ProjectServiceEJBRemote {
	public void addProject(Project p);
	public Project findProjectByName(String nameProject);
	public void deleteProject(Project p);
	public void updateProject(Project p);
	public Project  findProjectById(int id);
	public List<Project> findAll();
	
}
