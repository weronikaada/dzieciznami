package control;

import model.Customer;
import model.LogIn;
import java.util.*;

public class Application {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	Customer customer = new Customer(null, null, null, null, null, 0, null, 0, null);
	
	
	LogIn.login(customer);
	}
}
