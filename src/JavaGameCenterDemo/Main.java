package JavaGameCenterDemo;

import JavaGameCenterDemo.business.concretes.CampaignManager;
import JavaGameCenterDemo.business.concretes.CustomerManager;
import JavaGameCenterDemo.business.concretes.GameManager;
import JavaGameCenterDemo.business.concretes.PurchaseManager;
import JavaGameCenterDemo.core.adapters.concretes.FakeIdentityCheckerAdapter;
import JavaGameCenterDemo.core.adapters.concretes.KPSPublicAdapter;
import JavaGameCenterDemo.dataAccess.concretes.entityFramework.EFCampaignDao;
import JavaGameCenterDemo.dataAccess.concretes.entityFramework.EFCustomerDao;
import JavaGameCenterDemo.dataAccess.concretes.entityFramework.EFGameDao;
import JavaGameCenterDemo.dataAccess.concretes.hibernate.HibernateCampaignDao;
import JavaGameCenterDemo.dataAccess.concretes.hibernate.HibernateCustomerDao;
import JavaGameCenterDemo.dataAccess.concretes.hibernate.HibernateGameDao;
import JavaGameCenterDemo.entities.concretes.Campaign;
import JavaGameCenterDemo.entities.concretes.Customer;
import JavaGameCenterDemo.entities.concretes.Game;

public class Main {

	public static void main(String[] args) {

		PurchaseManager purchaseManager = new PurchaseManager();
        CampaignManager campaignManager = new CampaignManager(new HibernateCampaignDao());
//        CampaignManager campaignManager = new CampaignManager(new EFCampaignDao());
        GameManager gameManager =new GameManager(new HibernateGameDao());
//        GameManager gameManager =new GameManager(new EFGameDao());
        CustomerManager customerManager = new CustomerManager(new FakeIdentityCheckerAdapter(),new HibernateCustomerDao()); 
//        CustomerManager customerManager = new CustomerManager(new FakeIdentityCheckerAdapter(),new EFCustomerDao()); 
        Customer Volkan = new Customer(1, "Mehmet Volkan", "ASLAN", "123456", 2002);
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
