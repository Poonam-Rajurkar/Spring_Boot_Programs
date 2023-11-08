//Create a spring boot app to save the entity product with the 
//fields(id,pname,pamount,category) apply PostMapping and GetMapping 
//to the same

package com.example.controller;

//Import the useful packages for creation annotations
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProductDao;
import com.example.entity.Product;

//It is used to create RESTful web services using Spring MVC.
@RestController
//It is used to map web requests onto specific handler classes and/or handler methods. 
@RequestMapping("/product")
public class ProductController {

	// It is used for automatic dependency injection.
	@Autowired
	//Creating object of ProductDao interface
	private ProductDao dao;
	
	//It is used for mapping HTTP POST requests onto specific handler methods.
	@PostMapping("/addProducts")
	//It maps the HttpRequest body to a transfer or domain object
	public String addProducts(@RequestBody List<Product> products)
	{
		// This method allows us to save multiple entities to the DB.
		dao.saveAll(products);
		return "Product Booked Successfully. : " + products.size();
	}
	
	//It is used for mapping HTTP GET requests onto specific handler methods.
	@GetMapping("/getProducts")
	public List<Product> getProducts()
	{
		// This method allows us to get or retrieve all the entities from the database table.
		return (List<Product>)dao.findAll();
	}
	
}
