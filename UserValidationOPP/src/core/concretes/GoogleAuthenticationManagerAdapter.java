package core.concretes;

import core.abstracts.AuthService;
import googleAuthenticator.GoogleAuthenticatorManager;


public class GoogleAuthenticationManagerAdapter implements AuthService {
	
	GoogleAuthenticatorManager manager = new GoogleAuthenticatorManager();

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		manager.register(id,firstName,lastName,email,password);
		System.out.println("Signed up with a Google account : " + email);
		
	}

	@Override
	public void login(String email, String password) {
		manager.login(email, password);
		System.out.println("Signed in with a Google account : " + email);
		
	}

}
