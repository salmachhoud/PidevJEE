package Task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.persistence.Task;
import edu.esprit.pi.piPMT.persistence.Project;
import edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote;
import edu.esprit.pi.piPMT.services.TaskServiceEJBRemote;
import edu.esprit.pi.piPMT.services.UserServiceEJBRemote;

public class AddTask {

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		ProjectServiceEJBRemote proxy1 = (ProjectServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/ProjectServiceEJB!edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote");
		TaskServiceEJBRemote proxy = (TaskServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/TaskServiceEJB!edu.esprit.pi.piPMT.services.TaskServiceEJBRemote");
		
	
		//pidatabase esm el base de donnee
		Project t1 = new Project();
		t1.setName("apresInteg");
		t1.setCost(000);
		t1.setDescription("rrrr");
		t1.setNumberofparticipants(2);
		proxy1.addProject(t1);
		
		
		Task task = new Task();
		task.setName("Crud2");
		Date date = new Date(2016-10-05);
		task.setStartdate(date);
		//Date date2 = new Date(2016-10-05);
		task.setEnddate(date);
		task.setNumberofparticipants(9);
		
		Task task1 = new Task();
		task1.setName("task2");
		task1.setNumberofparticipants(0);
		
		
		List<Task> listTasks = new ArrayList<>();
		listTasks.add(task);
		listTasks.add(task1);
		
		proxy.addTaskToProject(1, listTasks);

		
		
		
		
		
	/*	Project p= (Project)proxy1.findProjectById(4);
	//	System.out.println(p.getDescription());
		proxy1.deleteProject(p);

		
		
		*/
		
		
	}

}
