package com.yrrhelp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yrrhelp.services.PurchaseReportsService;

@Controller
@RequestMapping("/purchaseReports")
public class PurchaseReportsController {
	 @Autowired
	  private PurchaseReportsService purchaseReportsService;
     @GetMapping("/all")  
	  public String getallPurchases(Model model) {	
    	 
			
			model.addAttribute("purchases",purchaseReportsService.getallPurchases());
			
		
    	 return "purchasereports";
     }
	
    	 @GetMapping("/{id}")  
         public String getPurchaseById(Model model, @PathVariable("id") String id) {
        	 
       	  model.addAttribute("purchase",purchaseReportsService.getPurchaseById(id));
       	  return "purchase";
         }
     
     }

