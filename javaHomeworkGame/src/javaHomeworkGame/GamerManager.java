package javaHomeworkGame;

public class GamerManager {
	
	public void createAccount(Gamer gamer) {
		System.out.println("Hesap Oluşturuldu." + gamer.getFirstName() + " " + gamer.getLastName());
	}
	
	public void updateAccount(Gamer gamer) {
		System.out.println("Hesap Güncellendi." + gamer.getFirstName());
	}
	
	public void deleteAccount(Gamer gamer) {
		System.out.println("Hesap Silindi." + gamer.getFirstName());
	}
	
	public void validateAccount(Gamer gamer) {
		System.out.println("Hesap Doğrulandı." + gamer.getFirstName());
	}

}
