import business.abstracts.UserService;
import business.concretes.UserManager;
import core.abstracts.AuthService;
import core.concretes.AuthManager;
import core.concretes.EmailVerificationManager;
import core.concretes.UserValidationManager;
import dataAccess.concretes.WorkUserDao;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new WorkUserDao());
		
		AuthService authService = new AuthManager(userService, new EmailVerificationManager(),new UserValidationManager());
		authService.register(1, "Tuncer", "Rüstemoðlu", "tuncerrstm@gmail.com", "12345");
		authService.login("tuncerrstm@gmail.com", "12345");
		
	}

}
