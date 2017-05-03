package User;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.persistence.User;
import edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote;
import edu.esprit.pi.piPMT.services.UserServiceEJBRemote;

public class ListUser {

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		ProjectServiceEJBRemote proxy1=(ProjectServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/ProjectServiceEJB!edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote");
		UserServiceEJBRemote proxy2 = (UserServiceEJBRemote )ctx.lookup("/piPMT-ear/piPMT-ejb/UserServiceEJB!edu.esprit.pi.piPMT.services.UserServiceEJBRemote");
		
		List<User>users = new ArrayList<>();
users=proxy2.findAll();
for (User user:users)
	{System.out.println(user.getLastname());
	System.out.println(user.getFirstname());
	System.out.println(user.getEmail());
	System.out.println(user.getPhone());
	System.out.println(user.getRole());

	}


	}

}
