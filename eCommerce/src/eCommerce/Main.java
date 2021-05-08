package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.UserValidationService;
import eCommerce.business.concretes.UserManager;
import eCommerce.business.concretes.UserValidationManager;
import eCommerce.core.concretes.LoggerService;
import eCommerce.core.concretes.MailLoggerManager;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Þule","Sarýçiçek","sulesaricicek@gmail.com","1234as");
		
		User user2 = new User(2,"a","b","ab@gmail.com","1234as");
		
		User user3 = new User(3,"Efe","Sarý","sulesaricicek@gmail.com","123");
		
		User user4 = new User(4,"Þule","","mail.com","123578");
		
		UserDao userDao = new HibernateUserDao();
		UserValidationService userValidationManager = new UserValidationManager();
		LoggerService loggerService = new MailLoggerManager();
		
		UserService userManager = new UserManager(userValidationManager, userDao, loggerService);
		
		
		userManager.login(user1);
		userManager.login(user3);
		userManager.register(user4);
		userManager.register(user2);
		
		
		
	
}
}
