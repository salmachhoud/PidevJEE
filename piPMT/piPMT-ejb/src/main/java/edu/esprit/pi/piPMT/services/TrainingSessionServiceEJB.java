package edu.esprit.pi.piPMT.services;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.pi.piPMT.persistence.TrainingSession;

@Stateless
@LocalBean
public class TrainingSessionServiceEJB implements TrainingSessionServiceEJBRemote {

	@PersistenceContext
	EntityManager em;
    
    public TrainingSessionServiceEJB() {
    }

	@Override
	public void addTrainingSession(TrainingSession t) {
		em.persist(t);
		em.flush();
	}
	
	@Override
	public List<TrainingSession> listAll() {
		return em.createQuery("SELECT t FROM TrainingSession t",TrainingSession.class).getResultList();
	
	}
	
	@Override
	public void deleteTrainingSession(TrainingSession t) {
		em.remove(em.merge(t));
		}

	@Override
	public void updateTrainingSession(TrainingSession t) {
		em.merge(t);	
	}

	@Override
	public TrainingSession findTrainingSessionById(int id) {
		return em.find(TrainingSession.class,id);
	}

	@Override
	public List<TrainingSession> getTrainingByName(String n) {
		Query req = em.createQuery
				("select t from TrainingSession t where t.name like :x ");
			req.setParameter("x", "%" +n+ "%");
			List resultList = req.getResultList();
			return resultList;
	}

}
