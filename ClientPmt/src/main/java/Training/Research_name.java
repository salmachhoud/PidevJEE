package Training;

import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import edu.esprit.pi.piPMT.persistence.TrainingSession;
import edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote;

public class Research_name{

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		TrainingSessionServiceEJBRemote remote=(TrainingSessionServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/TrainingSessionServiceEJB!edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote");
	
		String n = "ne";
		
		List<TrainingSession> tList = remote.getTrainingByName(n);
		int i =0;
		System.out.println(" ============Les noms trouves sont =========>");
		for(TrainingSession  c:tList)
		{
			i++;
			System.out.println("TrainingSession N'"+i);
			System.out.println("identifiant:  "+c.getId());
			System.out.println("nom:  "+c.getName());
			System.out.println("teamnumber:  "+c.getTeamnumber());
			System.out.println("----------------et-----------------");

		}

}

}
