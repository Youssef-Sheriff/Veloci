package models;

import java.util.List;

public class Product {

	private int id;
	private String name;
	private float price;
	private int stock;
	private String description;
	private Category category;
    private List<ProductImage> images;

	public Product() {

	}

	public Product(int id, String name, float price, int stock, String description, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.description = description;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
