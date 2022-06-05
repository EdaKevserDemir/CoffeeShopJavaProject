package CoffeeShopDemo2.core.adapters;

import CoffeeShopDemo2.business.abstracts.CustomerCheckService;
import CoffeeShopDemo2.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityIdentity()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getYearOfBirth());
			
			
		} catch (Exception e) {
			return false;
		}
		

		
	}

}
