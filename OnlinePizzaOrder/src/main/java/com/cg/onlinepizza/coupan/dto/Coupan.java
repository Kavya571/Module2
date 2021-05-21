package com.cg.onlinepizza.coupan.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coupan {
	@Id
	@GeneratedValue
	@Column
	private int coupanId;
	@Column
	private String coupanName;
	@Column
	private String coupanType;
	@Column
	private String coupanDescription;
	@Column
	private int coupanPizzaId;

	public int getCoupanId() {
		return coupanId;
	}

	public void setCoupanId(int coupanId) {
		this.coupanId = coupanId;
	}

	public String getCoupanName() {
		return coupanName;
	}

	public void setCoupanName(String coupanName) {
		this.coupanName = coupanName;
	}

	public String getCoupanType() {
		return coupanType;
	}

	public void setCoupanType(String coupanType) {
		this.coupanType = coupanType;
	}

	public String getCoupanDescription() {
		return coupanDescription;
	}

	public void setCoupanDescription(String coupanDescription) {
		this.coupanDescription = coupanDescription;
	}

	public int getCoupanPizzaId() {
		return coupanPizzaId;
	}

	public void setCoupanPizzaId(int coupanPizzaId) {
		this.coupanPizzaId = coupanPizzaId;
	}

}
