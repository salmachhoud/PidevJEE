package edu.esprit.pi.piPMT.services;

import java.util.List;

import javax.ejb.EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import edu.esprit.pi.piPMT.persistence.Project;



/**
 * Session Bean implementation class ProjectServiceEJB
 */

@Stateless

public class ProjectServiceEJB implements ProjectServiceEJBRemote {

	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public ProjectServiceEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addProject(Project p) {
		// TODO Auto-generated method stub
		em.persist(p);
		em.flush();
	}

	@Override
	public void deleteProject(Project p) {
		
		em.remove(em.merge(p));
		
		
	}

	@Override
	public void updateProject(Project p) {
		// TODO Auto-generated method stub
		em.merge(p);
		
	}

	@Override
	public Project findProjectById(int id) {
		// TODO Auto-generated method stub
		return em.find(Project.class,id);
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT c FROM Project c",Project.class).getResultList();
	}

	@Override
	public Project findProjectByName(String nameProject) {
		return em.createQuery("SELECT c FROM Project c WHERE c.name=?1",Project.class).setParameter(1, nameProject).getSingleResult();
	}
	
	
	

	
}
