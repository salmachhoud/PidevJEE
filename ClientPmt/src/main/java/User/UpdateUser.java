package User;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.persistence.User;
import edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote;
import edu.esprit.pi.piPMT.services.UserServiceEJBRemote;

public class UpdateUser {

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		ProjectServiceEJBRemote proxy1=(ProjectServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/ProjectServiceEJB!edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote");
		UserServiceEJBRemote proxy2 = (UserServiceEJBRemote )ctx.lookup("/piPMT-ear/piPMT-ejb/UserServiceEJB!edu.esprit.pi.piPMT.services.UserServiceEJBRemote");
		User user1 =new User();
		user1=proxy2.findUserById(8);
		user1.setEmail("ddddd");
		user1.setFirstname("dddd");
		
		proxy2.updateUser(user1);
				
				System.out.println("succes");

	}

}
