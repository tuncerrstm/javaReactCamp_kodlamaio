package javaHomeworkGame;

public class GamerManager {
	
	public void createAccount(Gamer gamer) {
		System.out.println("Hesap Olu�turuldu." + gamer.getFirstName() + " " + gamer.getLastName());
	}
	
	public void updateAccount(Gamer gamer) {
		System.out.println("Hesap G�ncellendi." + gamer.getFirstName());
	}
	
	public void deleteAccount(Gamer gamer) {
		System.out.println("Hesap Silindi." + gamer.getFirstName());
	}
	
	public void validateAccount(Gamer gamer) {
		System.out.println("Hesap Do�ruland�." + gamer.getFirstName());
	}

}
