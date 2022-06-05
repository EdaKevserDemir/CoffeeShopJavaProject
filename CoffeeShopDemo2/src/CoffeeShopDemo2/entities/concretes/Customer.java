package CoffeeShopDemo2.entities.concretes;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityIdentity;
	private int star;
	private int order;
	private int yearOfBirth;

	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, String nationalityIdentity) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityIdentity = nationalityIdentity;

	}

	public Customer(int id, String firstName, String lastName, String nationalityIdentity, int yearOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityIdentity = nationalityIdentity;
		this.yearOfBirth = yearOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityIdentity() {
		return nationalityIdentity;
	}

	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
