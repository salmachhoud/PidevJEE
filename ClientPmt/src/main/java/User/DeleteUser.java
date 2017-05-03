package User;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pi.piPMT.persistence.User;
import edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote;
import edu.esprit.pi.piPMT.services.UserServiceEJBRemote;

public class DeleteUser {

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		ProjectServiceEJBRemote proxy1=(ProjectServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/ProjectServiceEJB!edu.esprit.pi.piPMT.services.ProjectServiceEJBRemote");
		UserServiceEJBRemote proxy2 = (UserServiceEJBRemote )ctx.lookup("/piPMT-ear/piPMT-ejb/UserServiceEJB!edu.esprit.pi.piPMT.services.UserServiceEJBRemote");
		
		User u= (User)proxy2.findUserById(8);
		proxy2.deleteUser(u);
		System.out.println("succes");
	}

}
