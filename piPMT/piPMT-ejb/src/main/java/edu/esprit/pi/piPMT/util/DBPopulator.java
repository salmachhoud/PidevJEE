package edu.esprit.pi.piPMT.util;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import edu.esprit.pi.piPMT.persistence.Todo;
import edu.esprit.pi.piPMT.services.TodoServiceLocal;

@Singleton
@Startup
public class DBPopulator {

	@EJB
	private TodoServiceLocal todoServiceLocal;
	
	public DBPopulator() {
	}
	
	@PostConstruct
	public void init(){
		Todo t1 = new Todo("Learn JSF");
		Todo t2 = new Todo("Learn EJB");
		Todo t3 = new Todo("Learn JPA");
		todoServiceLocal.create(t1);
		todoServiceLocal.create(t2);
		todoServiceLocal.create(t3);
	}
}
