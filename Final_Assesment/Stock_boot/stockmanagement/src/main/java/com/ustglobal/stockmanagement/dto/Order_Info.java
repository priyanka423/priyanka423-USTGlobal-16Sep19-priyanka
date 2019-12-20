package com.ustglobal.stockmanagement.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="order_info")
public class Order_Info {

	@Id
	@Column
	@GeneratedValue
	private int oid;
	
	@Column
	private double total_price;
	
	@Column
	private double total_price_gst;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="order_history",joinColumns=@JoinColumn(name="oid"),inverseJoinColumns=@JoinColumn(name="pid"))
	private List<Products_Info> products;


	public int getOid() {
		return oid;
	}


	public void setOid(int oid) {
		this.oid = oid;
	}


	public double getTotal_price() {
		return total_price;
	}


	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}


	public double getTotal_price_gst() {
		return total_price_gst;
	}


	public void setTotal_price_gst(double total_price_gst) {
		this.total_price_gst = total_price_gst;
	}


	public List<Products_Info> getProducts() {
		return products;
	}


	public void setProducts(List<Products_Info> products) {
		this.products = products;
	}


	

}
