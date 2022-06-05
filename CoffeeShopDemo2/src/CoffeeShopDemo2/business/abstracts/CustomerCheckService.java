package CoffeeShopDemo2.business.abstracts;

import CoffeeShopDemo2.entities.concretes.Customer;

public interface CustomerCheckService  {
	boolean checkIfRealPerson(Customer customer);

}
