package Training;

import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import edu.esprit.pi.piPMT.persistence.TrainingSession;
import edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote;

public class Lister{

	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		TrainingSessionServiceEJBRemote remote=(TrainingSessionServiceEJBRemote)ctx.lookup("piPMT-ear/piPMT-ejb/TrainingSessionServiceEJB!edu.esprit.pi.piPMT.services.TrainingSessionServiceEJBRemote");
		
		List<TrainingSession> lst=new ArrayList<>();
		lst=remote.listAll();
		for(TrainingSession t:lst)
		{
			//System.out.println(t.getName()+"  "+t.getStartdate()+"  "+t.getEnddate()+"  "+t.getTeamnumber());
			System.out.println(t.toString());
		}

	}

}
