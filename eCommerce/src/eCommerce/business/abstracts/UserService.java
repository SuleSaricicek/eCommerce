package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserService {
	void register (User user);
	void login(User user);
	List<User> getAll();


}
