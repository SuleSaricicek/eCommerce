package eCommerce.dataAccess.concretes;

import java.util.List;


import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {

		System.out.println("Added to user: " + user.getFirstName() + user.getLastName());
	
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated to user: " + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted to user: " + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}