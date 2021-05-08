package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.entities.concretes.User;

public class GoogleAccountManager implements UserService {

	@Override
	public void register(User user) {
		System.out.println(user.getEmail() + " google hesap� ile kay�t ba�ar�l�");
		
	}

	@Override
	public void login(User user) {
		System.out.println("Say�n " + user.getFirstName() + user.getLastName() +  " Google hesab� ile giri� ba�ar�l�");
	
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}
