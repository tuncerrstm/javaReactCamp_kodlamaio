package javaHomeworkGame;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Tuncer");
		gamer.setLastName("Rüstemoðlu");
		gamer.setEmail("tuncerrstm@gmail.com");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.createAccount(gamer);
		gamerManager.updateAccount(gamer);
		gamerManager.validateAccount(gamer);
		gamerManager.deleteAccount(gamer);

		
		SellerManager sellerManager = new SellerManager();
		sellerManager.sellGame(gamer);
		

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.baseCampaignManager = new YeniCampaign();
		campaignManager.createCampaign();
		
		
	
		

	}

}