package eCommerce.business.abstracts;

public interface UserValidationService {
	
	boolean emailValidate(String email);
	boolean passwordValidate(String password);
	boolean nameValidate(String firstName, String lastName);
	

}
