package Task;


import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.persistence.Task;
import edu.esprit.pi.piPMT.persistence.User;
import edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote;
import edu.esprit.pi.piPMT.services.TaskServiceEJBRemote;

public class UpdateTask {

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		ProjectServiceEJBRemote proxy1 = (ProjectServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/ProjectServiceEJB!edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote");
		TaskServiceEJBRemote proxy = (TaskServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/TaskServiceEJB!edu.esprit.pi.piPMT.services.TaskServiceEJBRemote");
		Task t = new Task();
		t=proxy.findTaskById(1);
		t.setName("ddddd");
		t.setNumberofparticipants(10);
		
		proxy.updateTask(t);
				
				System.out.println("succes");
				
				
				
	}

}
