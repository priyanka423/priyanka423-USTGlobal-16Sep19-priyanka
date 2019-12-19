package com.ustglobal.library.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="book_inventory")
public class BookInventoryBean {
	@Id
	@Column
	@GeneratedValue
	private int book_inventory_id;
	@Column
	private String book_name;
	@Column
	private String author;
	@Column
	private double price;
	@Column
	private int count;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<BookIssuedBean> bookIssuedBeans;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="branch_id")
//	private List<BranchBean> branchBean=getBranchBean();
}
