package edu.esprit.pi.piPMT.services;



import java.util.List;

import javax.ejb.Remote;


import edu.esprit.pi.piPMT.persistence.User;


@Remote
public interface UserServiceEJBRemote {
	public void addUser(User u);

	public void deleteUser(User u);
	public void updateUser(User u);
	public User  findUserById(int id);
	public List<User> findAll();
	public User findUserByUserName(String nameUser);
}
