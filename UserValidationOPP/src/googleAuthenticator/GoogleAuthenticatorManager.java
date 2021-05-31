package googleAuthenticator;

public class GoogleAuthenticatorManager {

	public boolean register(int id, String firstName, String lastName, String email, String password) {
		
		System.out.println("To complete the membership process, please check your email. ");
		return true;
		
	}
	
	public boolean login(String email, String password) {
		
		System.out.println("Please login with Google account.");
		return true;
		
	}
}
