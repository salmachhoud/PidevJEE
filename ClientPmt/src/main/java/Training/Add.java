package Training;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import edu.esprit.pi.piPMT.persistence.TrainingSession;
import edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote;
import java.sql.Date;


public class Add {

	public static void main(String[] args) throws NamingException {
		
		InitialContext ctx = new InitialContext();
		TrainingSessionServiceEJBRemote remote=(TrainingSessionServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/TrainingSessionServiceEJB!edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote");
	
		TrainingSession tr=new TrainingSession();
		
		tr.setName("nene");
		tr.setTeamnumber(10);
		Date date = new Date(03-07-16);
		tr.setEnddate(date);
		tr.setStartdate(date);

	    remote.addTrainingSession(tr);
	    System.out.println("l'ajout a été effectué");
		
	}

}
