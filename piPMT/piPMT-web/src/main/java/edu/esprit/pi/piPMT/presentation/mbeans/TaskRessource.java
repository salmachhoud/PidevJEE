package edu.esprit.pi.piPMT.presentation.mbeans;

import java.util.ArrayList;
import java.util.List;

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
import edu.esprit.pi.piPMT.persistence.Project;
import edu.esprit.pi.piPMT.persistence.Task;
import edu.esprit.pi.piPMT.services.TaskServiceEJBRemote;

@Path("tasks")
@RequestScoped 
public class TaskRessource {
	@EJB 
	TaskServiceEJBRemote metier;
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addTask(Task t){  
    if(t==null){
	return Response.status(Status.NOT_ACCEPTABLE).entity("Failed to add").build();	
	
     }
	    metier.addTask(t);
		
		return Response.status(Status.ACCEPTED).entity("task added with succes").build();	
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTask(){
		
		return Response.ok(metier.findAllTasks()).build();
		}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modifierTask(Task p)
	{
	metier.updateTask(p);
	return Response.status(Status.ACCEPTED).entity("list updated with succes").build();
		
	}
	@DELETE
	@Path("{id}")
	@Consumes
	public Response Delete(@PathParam("id")int id)
	{
		metier.removeTask(id);
		return Response.status(Status.ACCEPTED).entity("list updated with succes").build();
	}
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response findTaskById(@PathParam("id")int id)
	{
		
		return Response.ok(metier.findTaskById(id)).build();
		
	}

	
}
