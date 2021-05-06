package JavaGameCenterDemo.business.abstracts;

import JavaGameCenterDemo.entities.concretes.Campaign;
import JavaGameCenterDemo.entities.concretes.Customer;
import JavaGameCenterDemo.entities.concretes.Game;

public interface PurchaseService {

	void gamePurchase(Game game,Customer customer);
	void gamePurchase(Game game,Customer customer,Campaign campaign);
}
