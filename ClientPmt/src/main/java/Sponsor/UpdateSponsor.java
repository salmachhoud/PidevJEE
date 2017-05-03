package Sponsor;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.persistence.Sponsor;
import edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote;

public class UpdateSponsor {

	public static void main(String[] args) throws NamingException {
		
		InitialContext ctx = new InitialContext();
		SponsorServiceEJBRemote proxy = (SponsorServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/SponsorServiceEJB!edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote");
		
		Sponsor sponsor = new Sponsor();
		sponsor.setEmail("waelUpdated@esprit.tn");
		sponsor.setName("waelUpdated");
		
		proxy.updateSponsor(sponsor);
		System.out.println("Sponsor Succesfully Updated");
	}

}
