package edu.esprit.pi.piPMT.services;



import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.pi.piPMT.persistence.Project;
import edu.esprit.pi.piPMT.persistence.User;


/**
 * Session Bean implementation class UserServiceEJB
 */
@Stateless
@LocalBean
public class UserServiceEJB implements UserServiceEJBRemote {

	@PersistenceContext
	EntityManager em;
    public UserServiceEJB() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public void addUser(User u) {
		em.persist(u);
		em.flush();
		
	}
	@Override
	public void deleteUser(User u) {
		em.remove(em.merge(u));
		
	}
	@Override
	public void updateUser(User u) {
		em.merge(u);
		
	}
	@Override
	public User findUserById(int id) {
		return em.find(User.class,id);
	}
	@Override
	public List<User> findAll() {
		return em.createQuery("SELECT u FROM User u",User.class).getResultList();
	}
	@Override
	public User findUserByUserName(String userName) {
		return em.createQuery("SELECT u FROM User u WHERE u.username=:fname",User.class)
				.setParameter("fname", userName)
				.getSingleResult();
	}
	
	

}
