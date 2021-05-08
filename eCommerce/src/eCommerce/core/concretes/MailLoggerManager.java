package eCommerce.core.concretes;

import eCommerce.entities.concretes.User;

public class MailLoggerManager implements LoggerService {

	@Override
	public void send(User user) {
		System.out.println(user.getEmail()+ " mail adresine üyelik sonucu gönderildi");
	}
}
