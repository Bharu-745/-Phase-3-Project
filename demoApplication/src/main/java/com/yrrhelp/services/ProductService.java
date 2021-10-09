package com.yrrhelp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.yrrhelp.models.Product;
import com.yrrhelp.models.User;

@Service 
public class ProductService {
	List<Product> listOfProducts = new ArrayList<>();
	List<User> listOfUsers = new ArrayList<>();
	public ProductService(){
	
	listOfProducts.add(new Product("123", "Running Shoe", "Addidas Running Shoe", "Suits Jogging, Threadmill Workouts ", "400.4", "Addidas"));
	listOfProducts.add(new Product("124", "Sneakers", "Nike Air Force 1", "Widely Sold Sneakers in Market! Grab Yours! ", "300.4", "Nike"));
	listOfProducts.add(new Product("125", "Short Shoes", "Reebok Red Sport Shoe", "Dazzling Red makes you a celebrity! ", "200.4", "Reebok"));
	listOfUsers.add(new User("987", "20210909" ,"alia"));
	listOfUsers.add(new User("765","20210809","bilva"));
	listOfUsers.add(new User("543","20210709","dhruv"));
	}
	public List<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public List<User> getAllUsers(){
	return listOfUsers;
	}
	
 
	
	public Product addProducts(String productId, String productCat,String productName,String productDescription,String productPrice,String productSeller) {
		listOfProducts.add(new Product(productId,productCat,productName,productDescription,productPrice,productSeller));
		Predicate<Product> byId = p -> p.getId().equals(productId);
		return filterProducts(byId);
	}
	
	public Product updateProducts(String productId, String productCat,String productName,String productDescription,String productPrice,String productSeller) {
		listOfProducts.remove(getProductById(productId));
		listOfProducts.add(new Product(productId,productCat,productName,productDescription,productPrice,productSeller));
		Predicate<Product> byId = p -> p.getId().equals(productId);
		return filterProducts(byId);
	}

	public Product getProductById(String id) {

		Predicate<Product> byId = p -> p.getId().equals(id);
		return filterProducts(byId);
	}
	public User getUserById(String id) {

		Predicate<User> byId = u -> u.getId().equals(id);
		return filterUsers(byId);
	}
	
	public String deleteProduct(String id) {
		System.out.println("Before Delete"+id + getProductById(id));
		listOfProducts.remove(getProductById(id));
		System.out.println("Post Delete"+getProductById(id));
		return "T";
	}

	public Product filterProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}
	public User filterUsers(Predicate<User> strategy) {
		return getAllUsers().stream().filter(strategy).findFirst().orElse(null);
	}
	
	
	public String removeProducts(Predicate<Product> strategy) {
		listOfProducts.remove(getAllProducts().stream().filter(strategy).findFirst().orElse(null));
		return "T";
	}
}
