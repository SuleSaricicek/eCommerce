	package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.UserValidationService;
import eCommerce.core.concretes.LoggerService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserValidationService valid;
	private UserDao userDao;
	private LoggerService log;
	
	public UserManager(UserValidationService valid, UserDao userDao, LoggerService log) {
		super();
		this.valid = valid;
		this.userDao = userDao;
		this.log= log;
	}

	@Override
	public void register(User user) {
		if(user.getFirstName()!=null && user.getLastName()!=null && user.getEmail()!=null && user.getPassword()!=null )
		{
			this.valid.emailValidate(user.getEmail());
			this.valid.passwordValidate(user.getPassword());
			this.valid.nameValidate(user.getFirstName(), user.getLastName());
			this.userDao.add(user);
			this.log.send(user);
			
					
		}else {
			
				System.out.println("Kullanýcý bilgileri geçersiz");
				
		}
			
	}
	@Override
	public void login(User user) {
		
		if(valid.emailValidate(user.getEmail())==true && valid.passwordValidate(user.getPassword())==true) {
			
			this.userDao.add(user);
			System.out.println("Kullanýcý giriþi baþarýlý");
			
		}else
		{
			System.out.println("Mail adresi ve ya þifre geçersiz");
		}
		
		
	}

	@Override
	public List<User> getAll() {
		System.out.println("aaaaaa");
		return null;
		
	}

}





