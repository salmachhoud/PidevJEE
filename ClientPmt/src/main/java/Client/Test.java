package Client;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;


import edu.esprit.pi.piPMT.persistence.Project;
import edu.esprit.pi.piPMT.persistence.Sponsor;
import edu.esprit.pi.piPMT.persistence.User;
import edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote;
import edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote;
import edu.esprit.pi.piPMT.services.UserServiceEJBRemote;

//import java.util.Date;

import java.sql.Date;


public class Test {

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		ProjectServiceEJBRemote proxy1=(ProjectServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/ProjectServiceEJB!edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote");
		UserServiceEJBRemote proxy2 = (UserServiceEJBRemote )ctx.lookup("/piPMT-ear/piPMT-ejb/UserServiceEJB!edu.esprit.pi.piPMT.services.UserServiceEJBRemote");
		SponsorServiceEJBRemote proxy3 = (SponsorServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/SponsorServiceEJB!edu.esprit.pi.piPMT.services.SponsorServiceEJBRemote");
		
		Project projet=new Project();
		projet.setDescription("devp");
		projet.setCategory("JEE");
		projet.setCost(10000);
		projet.setNumberofparticipants(5);
		projet.setName("Projet1");
		proxy1.addProject(projet);
		
		
		/*Sponsor sponsor = new Sponsor();
		sponsor.setEmail("wael@esprit");
		sponsor.setName("wael");
		proxy3.ajouterSponsor(sponsor);*/
	
		
		//****************//
		/*
		Project projet1=new Project();
		projet1.setDescription("dev");
		projet1.setCategory("JEE");
		projet1.setCost(10000);
		projet1.setNumberofparticipants(5);
		projet1.setName("Projet1");
		Date date = new Date(2016-10-05);
		projet1.setStartdate(date);
	proxy1.addProject(projet);
		proxy1.addProject(projet1);
		List<Project> list3=new ArrayList<>();
		list3=proxy1.findAll();
		for(Project projet3:list3)
		{
			System.out.println(projet3.getDescription());
		}
		
	/*	Project p= (Project)proxy1.findProjectById(1);
		System.out.println(p.getDescription());
		proxy1.deleteProject(p);
		System.out.println("succes"); */
		
		//***** update *//////
		
/*projet1=proxy1.findProjectById(2);
projet1.setCategory(".netm");
System.out.println(projet1.getId());
	//projet1.setId(2);
		proxy1.updateProject(projet1);
		System.out.println("succes"); 
		//System.out.println(proxy1.findProjectById(1));*/

		
//	Project p=(Project)proxy1.findProjectById(1);
//	System.out.println(p.toString());
		
	
		///proxy1.deleteProject(projet1);
	
		//****************//
		/*USER PART*/
				//****************//
		/*ADD User*/
			//******//
			User user1 =new User();
				user1.setEmail("nv");
				user1.setLastname("astname");
				user1.setPhone(0);
				user1.setRole("role");
				proxy2.addUser(user1);

				//****************//
		//****************//
				/*Get List User*/
				//****//
			/*	List<User>users = new ArrayList<>();
		users=proxy2.findAll();
		for (User user:users)
			{System.out.println(user.getLastname());}*/
			
		          //****************//
		         //****************//
		           /*Delete User*/
		              //****//
			
		/*User u= (User)proxy2.findUserById(8);
		proxy2.deleteUser(u);
		System.out.println("succes");	*/
				
		//****************//
		//****************//
		  /*Update User*/
		     //****//
			/*user1=proxy2.findUserById(8);
				user1.setEmail("ddddd");
				user1.setFirstname("dddd");
				
				proxy2.updateUser(user1);
						
						System.out.println("succes");*/

	
				//find project by name
				/*	Project p=proxy1.findProjectByName("projet2");
					System.out.println(p.getName());
				*/			
	
		

	}

}
