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
import edu.esprit.pi.piPMT.persistence.TrainingSession;
import edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote;

@Path("training")
@RequestScoped
public class TrainingSessionRessource {
	@EJB
	TrainingSessionServiceEJBRemote metier;
	
	@GET
	@Path("/test")
	public String test()
	{
		return "TEST";		
	}
	
	@POST
	@Path("/addt")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addProject(TrainingSession t){
		metier.addTrainingSession(t);
	
		return Response.status(Status.CREATED).build();
		
	}
	
	@GET
	@Path("/listert")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTrainingSession()
	{
		
		return Response.ok(metier.listAll()).build();
		
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateProject(TrainingSession t)
	{
	metier.updateTrainingSession(t);
	return Response.status(Status.ACCEPTED).build();
		
	}
	@DELETE
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteProject(TrainingSession t)
	{
	metier.deleteTrainingSession(t);
	return Response.status(Status.ACCEPTED).build();
		
	}
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getTrainingSessionById(@PathParam("id")int id)
	{
		return Response.ok(metier.findTrainingSessionById(id)).build();	
	}
	
	/*@GET
	@Path("/listerpar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTrainingSession2()
	{
		
		return Response.ok(metier.findAll()).build();
		
	}*/

}
