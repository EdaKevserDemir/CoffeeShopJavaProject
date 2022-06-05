package CoffeeShopDemo2.business.concretes;

import java.util.List;

import CoffeeShopDemo2.business.abstracts.BaseCustomerManager;
import CoffeeShopDemo2.dataAccess.abstracts.BaseRepository;
import CoffeeShopDemo2.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	BaseRepository baseRepository;

	public NeroCustomerManager(BaseRepository baseRepository) {

		this.baseRepository = baseRepository;
	}

	@Override
	public void add(Customer customer) {

		baseRepository.add(customer);
	}

	@Override
	public List<Customer> getAll() {
		return baseRepository.getAll();
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
