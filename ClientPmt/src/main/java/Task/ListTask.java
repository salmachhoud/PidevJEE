package Task;

import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import edu.esprit.pi.piPMT.persistence.Task;
import edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote;
import edu.esprit.pi.piPMT.services.TaskServiceEJBRemote;


public class ListTask {

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		ProjectServiceEJBRemote proxy1 = (ProjectServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/ProjectServiceEJB!edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote");
		TaskServiceEJBRemote proxy = (TaskServiceEJBRemote)ctx.lookup("/piPMT-ear/piPMT-ejb/TaskServiceEJB!edu.esprit.pi.piPMT.services.TaskServiceEJBRemote");
		//findAll	
		List<Task> list = new ArrayList<>();
		list=proxy.findAllTasks();
		for(Task task:list){
			
			System.out.println(task.getName());
			
		}
		}
	    


	}


