package core.concretes;

import business.abstracts.UserService;
import core.abstracts.AuthService;
import core.abstracts.UserValidationService;
import core.abstracts.VerificationService;
import entities.concretes.User;



public class AuthManager implements AuthService{

	UserService userService;
	UserValidationService userValidationService;
	VerificationService verificationService;
	


	public AuthManager() {

	}

	public AuthManager(UserService userService,VerificationService verificationService,UserValidationService userValidationService) {
		super();
		this.userService = userService;
		this.verificationService=verificationService;
		this.userValidationService=userValidationService;

	}
	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {

		User userToRegister = new User(id, firstName, lastName, email, password);
		if(!this.userValidationService.registerValidator(userToRegister))
		{
			System.out.println("Check your user information!");
		}
		
		if(!checkIfUserExists(email))
		{
			System.out.println("This e-mail address is registered. Please enter another e-mail address.");
			return;
		}
		if (!this.verificationService.verificate(userToRegister)) {
			System.out.println("Registration failed because membership verification could not be performed.");
			return;
		}

		userService.add(userToRegister);
		
	}

	@Override
	public void login(String email, String password) {
		if(!this.userValidationService.loginValidator(email, password))
		{
			System.out.println("Check your login information!");
			return;
		}
		User userToLogin=userService.getByEmailandPassword(email, password);
		
		if (userToLogin == null) {
			System.out.println("Check your e-mail or password!");
			return;
		}
		if(!checkIfUserVerified(userToLogin)) 
		{
			System.out.println("Login failed because the membership verification process has not been completed!");
			return;
		}
		System.out.println("Login successful! Welcome " + userToLogin.getFirstName() + " " + userToLogin.getLastName());
	}
	
	private boolean checkIfUserExists(String email)
	{
		return userService.getByMail(email)==null;
	}
	
	private boolean checkIfUserVerified(User user)
	{
		return verificationService.verificate(user);
	}

}