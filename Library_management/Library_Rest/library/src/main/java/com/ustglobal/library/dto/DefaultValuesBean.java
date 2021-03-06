package com.ustglobal.library.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="defaultvalue")
public class DefaultValuesBean {
	@Id
	@Column
	@GeneratedValue
	private int default_id;
	@Column
	private int fine_per_day;
	@Column
	private int submit_on;

}
