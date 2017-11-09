package data;

import view.*;
import control.*;
import model.*;
import java.util.*;

public class ProductDB {
private ArrayList<Product> productList = new ArrayList<Product>();
//constructor
public ProductDB() {
}

public Product browseByProductID(String productID) {
	for(int i=0;i<productList.size();i++) {
		if(productID.equals(productList.get(i).getProductID())) {
			return productList.get(i);
		}
	}
	return new Product();
}
public void assignProductList() throws Exception{
	Scanner input = new Scanner(new java.io.File("productDB.txt"));
	while(input.hasNextLine()) {
		Product product = new Product(input.next(), input.next(), input.next(),input.nextDouble(),input.next(),input.nextInt());
		productList.add(product);
	}
	input.close();
}
}
