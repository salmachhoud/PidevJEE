package Sponsor;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.persistence.Sponsor;
import edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote;

public class DeleteSponsor {

	public static void main(String[] args) throws NamingException {
		
		InitialContext ctx = new InitialContext();
		SponsorServiceEJBRemote proxy = (SponsorServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/SponsorServiceEJB!edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote");
		
		Sponsor sponsor = (Sponsor)proxy.findSponsorById(0);
		proxy.supprimerSponsor(sponsor);
		System.out.println("Sponser succesfully removed");
		
		
	}

}
