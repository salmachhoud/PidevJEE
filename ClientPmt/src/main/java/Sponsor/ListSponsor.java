package Sponsor;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote;
import edu.esprit.pi.piPMT.persistence.Sponsor;

public class ListSponsor {

	public static void main(String[] args)throws NamingException {
		InitialContext ctx = new InitialContext();
		SponsorServiceEJBRemote proxy = (SponsorServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/SponsorServiceEJB!edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote");
		
		List<Sponsor> sponsors = new ArrayList<>();
		sponsors = proxy.findAllSponsors();
		for(Sponsor sponsor:sponsors){
			System.out.println(sponsor.getName());
			System.out.println(sponsor.getEmail());
		}

	}

}
