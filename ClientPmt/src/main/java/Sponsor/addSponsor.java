package Sponsor;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.persistence.Sponsor;
import edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote;

public class addSponsor {

	public static void main(String[] args)throws NamingException {
		
		InitialContext ctx = new InitialContext();
		SponsorServiceEJBRemote proxy = (SponsorServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/SponsorServiceEJB!edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote");

		Sponsor sponsor = new Sponsor();
		sponsor.setEmail("wael@gmail.com");
		sponsor.setName("wael");
		proxy.ajouterSponsor(sponsor);
		System.out.println("Sponsor Succesfully added");
		
	}

}
