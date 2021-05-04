package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface PurchaseService {

	void gamePurchase(Game game,Customer customer);
	void gamePurchase(Game game,Customer customer,Campaign campaign);
}
