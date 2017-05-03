package Training;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import edu.esprit.pi.piPMT.persistence.TrainingSession;
import edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote;

public class Delete{

	public static void main(String[] args) throws NamingException {
		
		InitialContext ctx = new InitialContext();
		TrainingSessionServiceEJBRemote remote=(TrainingSessionServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/TrainingSessionServiceEJB!edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote");
	
		TrainingSession t= (TrainingSession)remote.findTrainingSessionById(2);
		remote.deleteTrainingSession(t);
		System.out.println("l'identifier numero avec succés"); 

	}

}
