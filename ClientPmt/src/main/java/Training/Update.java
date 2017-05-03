package Training;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import edu.esprit.pi.piPMT.persistence.TrainingSession;
import edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote;

public class Update{

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		TrainingSessionServiceEJBRemote remote=(TrainingSessionServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/TrainingSessionServiceEJB!edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote");
	
		TrainingSession t=new TrainingSession();
		t=remote.findTrainingSessionById(2);
		t.setName("hafsa");
		remote.updateTrainingSession(t);
		System.out.println("Mise à jour effectueé"); 

	}

}
