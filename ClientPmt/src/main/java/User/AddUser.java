package User;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.persistence.User;
import edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote;
import edu.esprit.pi.piPMT.services.UserServiceEJBRemote;

public class AddUser {

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		ProjectServiceEJBRemote proxy1=(ProjectServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/ProjectServiceEJB!edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote");
		UserServiceEJBRemote proxy2 = (UserServiceEJBRemote )ctx.lookup("/piPMT-ear/piPMT-ejb/UserServiceEJB!edu.esprit.pi.piPMT.services.UserServiceEJBRemote");
		
		
		User user1 =new User();
			user1.setEmail("nv");
			user1.setLastname("astname");
			user1.setPhone(0);
			user1.setRole("role");
			proxy2.addUser(user1);
			System.out.println("Success");
	}

}
