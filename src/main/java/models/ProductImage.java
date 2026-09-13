package models;

public class ProductImage {

	private int id;
	private int productId;
	private String imagePath;

	public ProductImage() {
	}

	public ProductImage(int id, int productId, String imagePath) {
		this.id = id;
		this.productId = productId;
		this.imagePath = imagePath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}