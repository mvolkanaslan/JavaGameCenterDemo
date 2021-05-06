package JavaGameCenterDemo.core.adapters.concretes;

import java.rmi.RemoteException;

import JavaGameCenterDemo.core.adapters.abstracts.CustomerIdentityCheckService;
import JavaGameCenterDemo.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class KPSPublicAdapter implements CustomerIdentityCheckService{

	@Override
	public boolean checkCustomer(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(
					Long.parseLong(customer.getIdentityNumber()), 
					customer.getFirstName(), 
					customer.getLastName(),
					customer.getYearOfBirth());
			
		} catch (NumberFormatException e) {
			System.out.println(e);
			e.printStackTrace();
			
		} catch (RemoteException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		return result;
	}

}
