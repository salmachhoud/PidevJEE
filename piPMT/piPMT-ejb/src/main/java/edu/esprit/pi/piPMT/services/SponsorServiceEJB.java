package edu.esprit.pi.piPMT.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.esprit.pi.piPMT.persistence.Project;
import edu.esprit.pi.piPMT.persistence.Sponsor;

/**
 * Session Bean implementation class SponsorService
 */
@Stateless
@LocalBean
public class SponsorServiceEJB implements SponsorServiceEJBRemote {


    @PersistenceContext
    private EntityManager em; 
    public SponsorServiceEJB() {
        
    }
    @Override
    public void ajouterSponsor(Sponsor sponsor){
    	em.persist(sponsor);
    }
    @Override
    public void supprimerSponsor(Sponsor sponsor){
    	em.remove(em.merge(sponsor));
    }
    @Override
    public void updateSponsor(Sponsor sponsor){
    	em.merge(sponsor);
    }
    @Override
    public Sponsor findSponsorById(int id){
    	return em.find(Sponsor.class,id);
    }
    @Override
    public List<Sponsor> findAllSponsors(){
    	return em.createQuery("SELECT s FROM Sponsor s",Sponsor.class).getResultList();
    }
    
	

}
