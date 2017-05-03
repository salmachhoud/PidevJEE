package edu.esprit.pi.piPMT.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pi.piPMT.persistence.Project;
import edu.esprit.pi.piPMT.persistence.Task;

@Remote
public interface TaskServiceEJBRemote {
	public void addTask(Task t);
	public void addTaskToProject(int id, List<Task> listTasks);//addUtilisateurToEmission
	//projet ManyToOne        Task OneToMany
	//utlisateur project      //emission houwa task
	void updateTask(Task task);
	void removeTask(int id);
	public List<Task> findAllTasks();
	public Task findTaskByName(String tname);
	public Task findTaskById(int idTask);
	
}
