package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * Tbinstrtenderdetail generated by hbm2java
 */
public class Tbinstrtenderdetail implements java.io.Serializable {

	private TbinstrtenderdetailId id;
	private BigDecimal bidLower;
	private BigDecimal bidUpper;
	private BigDecimal bidAmount;

	public Tbinstrtenderdetail() {
	}

	public Tbinstrtenderdetail(TbinstrtenderdetailId id, BigDecimal bidLower,
			BigDecimal bidUpper, BigDecimal bidAmount) {
		this.id = id;
		this.bidLower = bidLower;
		this.bidUpper = bidUpper;
		this.bidAmount = bidAmount;
	}

	public TbinstrtenderdetailId getId() {
		return this.id;
	}

	public void setId(TbinstrtenderdetailId id) {
		this.id = id;
	}

	public BigDecimal getBidLower() {
		return this.bidLower;
	}

	public void setBidLower(BigDecimal bidLower) {
		this.bidLower = bidLower;
	}

	public BigDecimal getBidUpper() {
		return this.bidUpper;
	}

	public void setBidUpper(BigDecimal bidUpper) {
		this.bidUpper = bidUpper;
	}

	public BigDecimal getBidAmount() {
		return this.bidAmount;
	}

	public void setBidAmount(BigDecimal bidAmount) {
		this.bidAmount = bidAmount;
	}

}