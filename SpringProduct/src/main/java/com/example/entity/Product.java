//Create spring boot app to save Product entity.
//add three details id, pname, pamount

package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//It is used at the class level and marks the class as a persistent entity.
@Entity
//This will allows you to specify the details of the table that will be used to persist the entity in the database.
@Table(name="products")
public class Product {

	//This will indicates the member field below is the primary key of the current entity. 
	@Id
	//It is used to automatically generate unique values for primary key columns within our database tables.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pname;
	private double amount;
	private String category;
	
	//Generating getters and setters of respected variables
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
