package CoffeeShopDemo2.entities.concretes;

public class CoffeeShop {
	private int id;
	private String shopName;
	
	public CoffeeShop() {
		super();
	}

	public CoffeeShop(int id, String shopName) {
		super();
		this.id = id;
		this.shopName = shopName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	

}
