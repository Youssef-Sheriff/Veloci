package models;

public class Customer extends User {
	private int id;
	private User user;
	private String name;
	private String email;
	private String address;
	private String phone;

	public Customer() {
	}

	public Customer(int id, User user, String name, String email, String address, String phone) {
		super();
		this.id = id;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
