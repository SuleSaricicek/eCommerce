package eCommerce.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserValidationService;

public class UserValidationManager implements UserValidationService{

	public boolean emailValidate(String email) {
		
		
			String regex ="[a-zA-Z0-9.-_]+@[a-zA-Z0-9.]$";
			Pattern pattern = Pattern.compile(regex);
			Matcher control = pattern.matcher("email");
			
			if(control.matches())
	        {
	            System.out.println("Yanlýþ e-posta biçimi");
	            return false;
	        }
			return true;		
	}
	

	@Override
	public boolean passwordValidate(String password) {
		return password.length() >= 6;
		
	}

	@Override
	public boolean nameValidate(String firstName, String lastName) {
	
		return firstName.length() >= 2 && lastName.length() >=2 ;
	}
	

}
