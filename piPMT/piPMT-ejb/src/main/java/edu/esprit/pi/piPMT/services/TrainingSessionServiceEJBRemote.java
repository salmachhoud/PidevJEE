package edu.esprit.pi.piPMT.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pi.piPMT.persistence.TrainingSession;

@Remote
public interface TrainingSessionServiceEJBRemote {
	
	public void addTrainingSession(TrainingSession t);
	public void deleteTrainingSession(TrainingSession t);
	public void updateTrainingSession(TrainingSession t);
	public TrainingSession  findTrainingSessionById(int id);
	public List<TrainingSession> listAll();
	public List<TrainingSession> getTrainingByName(String n);

}
