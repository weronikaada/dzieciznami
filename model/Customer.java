package model;

import java.util.*;

public class Customer extends User {
	private String firstName;
	private String lastName;
	private String address;
	private int postcode;
	private String dob;
	private int telNumber;
	private String email;

	
	public Customer(String userName, String password, String firstName, String lastName, String address, int postcode,
			String dob, int telNumber, String email) {
		super(userName, password);
		this.firstName =firstName;  
		this.lastName =lastName;  
		this.address = address;  
		this.postcode = postcode; 
		this.dob = dob; 
		this.telNumber = telNumber;  
		this.email = email;
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
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;	
	}
	
	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;	
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;	
	}
	
	public int getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(int telNumber) {
		this.telNumber = telNumber;	
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;	
	}
	
	
	public ArrayList<Order>finalizedOrders = new ArrayList<Order>();
	
	public ArrayList<Product>soldItems = new ArrayList<Product>();
	
	public ArrayList<Product>shoppingCart = new ArrayList<Product>();
	
	public ArrayList<Product>postedItems = new ArrayList<Product>();
	
	//method that adds product to the shopping cart
	public void addToCart(String choice) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter product ID: ");
		String choice1 = input.next();
		shoppingCart.add(choice1);
		//choice1.setAvailability = false;
		
	}	
	
	//method that removes product from the shopping cart
	public void deleteFromCart(String choice) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter product ID: ");
		String choice2 = input.next();
		shoppingCart.remove(choice2);
		//choice.setAvailbility = true;
	}
	
	public void addPostedItem(Product newProduct) {
		postedItems.add(newProduct);
	}
	
	public void deletePostedItem(String choice) {
		System.out.println("Product ID to be deleted: ");
		postedItems.remove(choice);
	}
	
	
	
	
}

