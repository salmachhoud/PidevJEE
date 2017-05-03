package edu.esprit.pi.piPMT.presentation.mbeans;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


import edu.esprit.pi.piPMT.persistence.Sponsor;
import edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote;

@Path("sponsor")
@RequestScoped
public class SponsorRessource {
	
	@EJB
	SponsorServiceEJBRemote metier;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addSponsor(Sponsor sponsor){
		metier.ajouterSponsor(sponsor);
	
		return Response.status(Status.CREATED).build();
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSponsor()
	{
		
		return Response.ok(metier.findAllSponsors()).build();
		
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateSponsor(Sponsor sponsor)
	{
	metier.updateSponsor(sponsor);
	return Response.status(Status.ACCEPTED).build();
		
	}
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteSponsor(Sponsor sponsor)
	{
	metier.supprimerSponsor(sponsor);
	return Response.status(Status.ACCEPTED).build();
		
	}
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getSponsorById(@PathParam("id")int id)
	{
		
		return Response.ok(metier.findSponsorById(id)).build();
		
	}
	

}
