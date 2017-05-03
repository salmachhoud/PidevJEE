package edu.esprit.pi.piPMT.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pi.piPMT.persistence.Sponsor;

@Remote
public interface SponsorServiceEJBRemote {
	public void ajouterSponsor(Sponsor sponsor);
	public void supprimerSponsor(Sponsor sponsor);
	public void updateSponsor(Sponsor sponsor);
	public Sponsor findSponsorById(int id);
	public List<Sponsor> findAllSponsors();
	
}
