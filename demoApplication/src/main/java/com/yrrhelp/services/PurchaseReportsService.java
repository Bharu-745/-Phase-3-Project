package com.yrrhelp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yrrhelp.models.Product;
import com.yrrhelp.models.PurchaseReports;
import com.yrrhelp.models.User;


@Service

public class PurchaseReportsService {
	List<PurchaseReports> listOfProducts = new ArrayList<>();
	public PurchaseReportsService(){
		
		listOfProducts.add(new PurchaseReports("123", "Running Shoe", "Addidas Running Shoe", "ABC ","20190101", "400.4" ));
		listOfProducts.add(new PurchaseReports("124", "Sneakers", "Nike Air Force 1", "ZMV", "20200101", "300.4"));
		listOfProducts.add(new PurchaseReports("125", "Short Shoes", "Reebok Red Sport Shoe", "TMZ","20210101", "200.4"));
	
		}
	public List<PurchaseReports> getallPurchases(){
		return listOfProducts;
	}
	
	public PurchaseReports getPurchaseById(String id) {

		Predicate<PurchaseReports> byId = p -> p.getId().equals(id);
		return filterPurchases(byId);
	}

	public PurchaseReports filterPurchases(Predicate<PurchaseReports> strategy) {
		return getallPurchases().stream().filter(strategy).findFirst().orElse(null);
	}
	
	}