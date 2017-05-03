package edu.esprit.pi.piPMT.services;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import edu.esprit.pi.piPMT.persistence.Project;
import edu.esprit.pi.piPMT.persistence.Task;

/**
 * Session Bean implementation class TaskServiceEJB
 */
@Stateless
public class TaskServiceEJB implements TaskServiceEJBRemote {
	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public TaskServiceEJB() {

	}
	/**
	 * this method allows to add task 
	 * @param t
	 */

	@Override
	public void addTask(Task t) {
		em.persist(t);
		
	}
	/**
	 * this method return List of tasks 
	 * @return List<Task>
	 */

	@Override
	public List<Task> findAllTasks() {

		return em.createQuery("SELECT t FROM Task t", Task.class).getResultList();
	}
	/**
	 * this method allows to find Task with the name entered
	 * @param tname
	 * @return Task 
	 */
	@Override
	public Task findTaskByName(String tname) {

		return (Task) em.createQuery("select t from Task t Where t.name=?1").setParameter(1, tname).getSingleResult();
	}
	/**
	 * this method allows to update a Task
	 * @param task 
	 */
	@Override
	public void updateTask(Task task) {
		em.merge(task);

	}
	/**
	 * this method allows to find Task with the id entered
	 * @param idTask
	 * @return Task 
	 */

	@Override
	public Task findTaskById(int idTask) {
		// TODO Auto-generated method stub
		return em.find(Task.class, idTask);
	}
	/**
	 * this method allows to delete a Task
	 * @param task
	 * @return Boolean 
	 */
	@Override
	public void removeTask(int id) {
		Task t =new Task();
		t=findTaskById(id);
		em.remove(em.merge(t));
	
	}
	/**
	 * this method allows to add list of Tasks to a project
	 * @param id
	 * @param listTasks
	 */
	@Override
	public void addTaskToProject(int id, List<Task> listTasks) {
		Project b = em.createQuery("SELECT c FROM Project c where c.id=?1", Project.class).setParameter(1, id)
				.getSingleResult();
		b.affectTaskToProject(listTasks);
	}

}
