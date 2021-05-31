package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void add(User user) {
		userDao.add(user);
		System.out.println("User added. ");
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		System.out.println("User updated.");
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("User deleted.");
		
	}

	@Override
	public User getById(int id) {
		
		return userDao.getById(id);
	}

	@Override
	public User getByMail(String email) {
		
		return userDao.getByMail(email);
	}

	@Override
	public User getByEmailandPassword(String email, String password) {
		
		return userDao.getByEmailandPassword(email, password);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}
	
	
}
