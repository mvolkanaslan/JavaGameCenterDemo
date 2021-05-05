package Main;

import Adapters.FakeIdentityChecker;
import Adapters.TrGovIdentityChecker;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.PurchaseManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {

		PurchaseManager purchaseManager = new PurchaseManager();
        CampaignManager campaignManager = new CampaignManager();
        GameManager gameManager =new GameManager();
        CustomerManager customerManager = new CustomerManager(new FakeIdentityChecker()); 
        Customer Volkan = new Customer(1, "Mehmet Volkan", "ASLAN", "123456", 1989);
        customerManager.add(Volkan);
        
        System.out.println("-------------------------------");
        
		Campaign blackFriday = new Campaign(1, "Black Friday Campaign", 30);
		campaignManager.add(blackFriday); 
		campaignManager.delete(blackFriday); 
		campaignManager.update(blackFriday); 
		
		System.out.println("-------------------------------");
		Game fifa21 =new Game(1, "FIFA 2021", 100);
		Game Crysis =new Game(1, "Crysis Remastered", 150);
		
		purchaseManager.gamePurchase(fifa21, Volkan);
		purchaseManager.gamePurchase(fifa21, Volkan, blackFriday);
		
	

		
		

		

	}

}
