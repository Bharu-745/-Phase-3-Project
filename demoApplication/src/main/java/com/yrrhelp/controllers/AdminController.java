package com.yrrhelp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yrrhelp.services.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public String showAdminPage() {
		
		System.out.println("In Admin Page");
		
		return "admin";
	}
	
	@PostMapping("/admindash")
	public String showAdminDashPage() {
		
		System.out.println("In Admin Dash Page");
		
		
		return "AdminDashboard";
	}
	
	@GetMapping("/main")
	public String getAllProducts(Model model) {	 
 		model.addAttribute("products",productService.getAllProducts());
 		
		System.out.println("In Admin Main Page");
		
		return "main";
	}
	
	@GetMapping("/details")
	public String showAdminDetailsPage() {
			
			System.out.println("In Admin Details Page");
			
			return "details";
		}
	@GetMapping("/change")
	public String showChangePasswordPage() {
			
			System.out.println("In Change Password  Page");
			
			return "ChangePassword";
		}
		
	@GetMapping("/delete/{productId}")
	public String deleteProduct(Model model, @PathVariable("productId") String productId) {	 
 		model.addAttribute("product",productService.deleteProduct(productId));
 		
		System.out.println("In Deletion Page");
		
		return "product_all";
	}
	@GetMapping("/update")
	public String showAdminUpdatePage() {
			
			System.out.println("In Admin Update Page");
			
			return "update";
		}  
	
	@GetMapping("/update/{productId}/{productCat}/{productName}/{productDescription}/{productPrice}/{productSeller}")  
	  public String updateProducts(Model model, @PathVariable("productId") String productId, @PathVariable("productCat") String productCat, @PathVariable("productName") String productName,@PathVariable("productDescription") String productDescription,@PathVariable("productPrice") String productPrice,@PathVariable("productSeller") String productSeller) {	 
		model.addAttribute("product",productService.updateProducts(productId,productCat,productName,productDescription,productPrice,productSeller));
	
		  return "update";
	  
   
   
    }
	  
      @GetMapping("/add/{productId}/{productCat}/{productName}/{productDescription}/{productPrice}/{productSeller}")  
	  public String addProducts(Model model, @PathVariable("productId") String productId, @PathVariable("productCat") String productCat, @PathVariable("productName") String productName,@PathVariable("productDescription") String productDescription,@PathVariable("productPrice") String productPrice,@PathVariable("productSeller") String productSeller) {	 
 		model.addAttribute("product",productService.addProducts(productId,productCat,productName,productDescription,productPrice,productSeller));
 	
		  return "details";
	  
     
     
      }
      @GetMapping("/users_all")  
   	  public String getAllUsers(Model model) {	 
    		model.addAttribute("users",productService.getAllUsers());
    		
   		  return "users_all";
   	  }
        
         @GetMapping("/{userId}")
         public String getUserById(Model model, @PathVariable("userId") String userId) {
       	 
       	  model.addAttribute("user",productService.getUserById(userId));
       	  return "user";
         }
}
