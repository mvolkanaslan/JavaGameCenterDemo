package Concrete;

import Abstract.PurchaseService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class PurchaseManager implements PurchaseService{

	@Override
	public void gamePurchase(Game game, Customer customer) {
		System.out.println(customer.getFirstName()+ " " + customer.getLastName()+", buy " +game.getName() + " game. Price : " + game.getPrice());
		
	}

	@Override
	public void gamePurchase(Game game, Customer customer, Campaign campaign) {
		double discountedPrice = game.getPrice()*(1-(campaign.getDiscountRate()/100));
		System.out.println(customer.getFirstName()+ " " + customer.getLastName()+", buy :" +game.getName() + "game. Price : "+discountedPrice + " , " +campaign.getDiscountRate()+"% discount with "+campaign.getName());
		// TODO Auto-generated method stub
		
	}

}
