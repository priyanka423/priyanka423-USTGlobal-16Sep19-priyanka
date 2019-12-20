package com.ustglobal.stockmanagement.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="product")
public class Products_Info {
	
	@Id
	@Column
	@GeneratedValue
	private int pid;
	
	@Column(unique = true)
	private String name;
	
	@Column
	private String category;
	
	@Column
	private String company;
	
	@Column
	private int quantity;
	
	@Column
	private double price;
	
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "products")
	private List<Order_Info> orders;

	public List<Order_Info> getOrders() {
		return orders;
	}

	public void setOrders(List<Order_Info> orders) {
		this.orders = orders;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
