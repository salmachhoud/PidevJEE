package edu.esprit.pi.piPMT.presentation.mbeans;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import edu.esprit.pi.piPMT.persistence.Project;
import edu.esprit.pi.piPMT.persistence.User;
import edu.esprit.pi.piPMT.services.UserServiceEJBRemote;

@Path("user")
@RequestScoped
public class UserResource {
	@EJB
	UserServiceEJBRemote metier;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUser(User u) {
		metier.addUser(u);
		return Response.status(Status.CREATED).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser() {
		return Response.ok(metier.findAll()).build();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateUser(User u) {
		metier.updateUser(u);
		return Response.status(Status.ACCEPTED).build();
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteUser(User u) {
		metier.deleteUser(u);
		return Response.status(Status.ACCEPTED).build();

	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserById(@PathParam("id") int id) {
		return Response.ok(metier.findUserById(id)).build();
	}
}
