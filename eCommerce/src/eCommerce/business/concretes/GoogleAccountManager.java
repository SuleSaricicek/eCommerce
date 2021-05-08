package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.entities.concretes.User;

public class GoogleAccountManager implements UserService {

	@Override
	public void register(User user) {
		System.out.println(user.getEmail() + " google hesapý ile kayýt baþarýlý");
		
	}

	@Override
	public void login(User user) {
		System.out.println("Sayýn " + user.getFirstName() + user.getLastName() +  " Google hesabý ile giriþ baþarýlý");
	
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}
