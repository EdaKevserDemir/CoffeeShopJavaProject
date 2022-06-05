package CoffeeShopDemo2.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import CoffeeShopDemo2.dataAccess.abstracts.BaseRepository;
import CoffeeShopDemo2.entities.concretes.Customer;

public class HibernateCustomerRepository implements BaseRepository {

	List<Customer> customers;

	public HibernateCustomerRepository() {

		customers = new ArrayList<Customer>();
	}

	@Override
	public void add(Customer customer) {

		if (!checkIfCustomerIdentity(customer.getNationalityIdentity())) {
			customers.add(customer);
		} else {
			System.out.println("Kayýtlý müþteri.");
		}
	}

	@Override
	public void delete(Customer customer) {

		customers.remove(getById(customer.getId()));
	}

	@Override
	public void update(Customer customer) {

		Customer customerToFind=getById(customer.getId());
		
		customerToFind.setFirstName(customer.getFirstName());
		customerToFind.setLastName(customer.getLastName());
		customerToFind.setNationalityIdentity(customer.getNationalityIdentity());
		customerToFind.setOrder(customer.getOrder());
		customerToFind.setYearOfBirth(customer.getYearOfBirth());
		
		
	}

	@Override
	public List<Customer> getAll() {

		return customers;
	}

	@Override
	public Customer getById(int id) {

		Customer customerToFind = null;
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				customerToFind = customer;
			}
		}

		return customerToFind;
	}

	private boolean checkIfCustomerIdentity(String customerIdentity) {
		boolean exist = false;
		for (Customer customer : customers) {

			if (customer.getNationalityIdentity() == customerIdentity) {
				exist = true;
			}
		}
		return exist;

	}

}
