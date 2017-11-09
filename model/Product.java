package model;

public class Product {

	private String category;
	private String description;
	private double price;
	private String productID;
	private boolean availability = true;
	private int postcode;
	private String name;
	
	//constructor
	public Product(String name, String category, String description, double price, String productID, int postcode) {
		this.name = name;
		this.category=category;
		this.description = description;
		this.price = price;
		this.productID = productID;
		this.postcode = postcode;
	}
	//getters
	public String getCategory() {
		return category;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public String getProductID() {
		return productID;
	}
	public boolean getAvailability() {
		return availability;
	}
	public int getPostcode() {
		return postcode;
	}
	public String getName() {
		return name;
	}
	//setters
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public void setName(String name) {
		this.name = name;
	}


}