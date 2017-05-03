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
import javax.xml.soap.Name;

import edu.esprit.pi.piPMT.persistence.Project;
import edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote;

@Path("project")
@RequestScoped
public class ProjectRessource {
	@EJB
	ProjectServiceEJBRemote metier;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addProject(Project p){
		metier.addProject(p);
	
		return Response.status(Status.CREATED).build();
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProject()
	{
		
		return Response.ok(metier.findAll()).build();
		
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateProject(Project p)
	{
	metier.updateProject(p);
	return Response.status(Status.ACCEPTED).build();
		
	}
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteProject(Project p)
	{
	metier.deleteProject(p);
	return Response.status(Status.ACCEPTED).build();
		
	}
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getProjectById(@PathParam("id")int id)
	{
		
		return Response.ok(metier.findProjectById(id)).build();
		
	}
	

}
