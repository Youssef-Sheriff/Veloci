package models;

public class Customer {
	private int id;
	private int userId;
	private String name;
	private String email;
	private String address;
	private String phone;

	public Customer() {
	}

	public Customer(int id, int userId, String name, String email, String address, String phone) {
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	public Customer(int userId, String name, String email, String address, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser() {
		return userId;
	}

	public void setUser(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
