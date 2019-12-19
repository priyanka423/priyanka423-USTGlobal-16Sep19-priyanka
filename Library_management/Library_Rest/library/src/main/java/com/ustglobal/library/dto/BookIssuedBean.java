package com.ustglobal.library.dto;

import java.util.ArrayList;
import java.util.Date;
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
@Table(name="issued")
public class BookIssuedBean {
	@Id
	@Column
	@GeneratedValue
	private int book_issued_id;
	@Column
	private Date dispatched_date;
	@Column
	private Date submission_date;
	@Column
	private Date submitted_date;
	@Column
	private String is_submitted;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private UserBean userBean;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="book_inventory_id")
	private BookInventoryBean bookInventoryBean;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="BookIssued_BookInventry",
//	joinColumns=@JoinColumn(name="book_issued_id"), 
//	inverseJoinColumns = @JoinColumn(name="book_inventory_id"))
//	private List<BookInventoryBean> bookInventoryBean=getBookInventoryBean();

}
