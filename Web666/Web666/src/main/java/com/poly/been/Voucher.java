package com.poly.been;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Vouchers")
public class Voucher implements Serializable {
	@Id
	@Column(name = "vouId")
	private String vouId;

	@Column(name = "discount_percentage")
	private Double discountPercentage;

	@Column(name = "expiry_date")
	private LocalDate expiryDate;

	@Column(name = "quantity")
	private int quantity;

	@OneToMany(mappedBy = "voucher", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Order> orders;

	public String getVouId() {
		return vouId;
	}

	public void setVouId(String vouId) {
		this.vouId = vouId;
	}

	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Voucher(String vouId, Double discountPercentage, LocalDate expiryDate, int quantity, List<Order> orders) {
		super();
		this.vouId = vouId;
		this.discountPercentage = discountPercentage;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		this.orders = orders;
	}

	public Voucher() {
		super();
	}

}
