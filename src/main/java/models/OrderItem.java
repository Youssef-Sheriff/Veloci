package models;

public class OrderItem {

	private int id;
	private Product product;
	private double price;
	private int quantity;
	
	public OrderItem() {
		
	}

	public OrderItem(int id, Product product, float price, int quantity) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
