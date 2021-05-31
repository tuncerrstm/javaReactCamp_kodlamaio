package javaHomeworkGame;

public class DiscountCampaign extends BaseCampaingManager{
	
	@Override
	public void createCampaign() {
		System.out.println("Ýndirim kampanyasý oluþturuldu.");
		
	}

	@Override
	public void deleteCampaign() {
		System.out.println("Ýndirim kampanyasý silindi.");
		
	}

	@Override
	public void updateCampaign() {
		System.out.println("Ýndirim kampanyasý güncellendi.");
		
	}

}