package com.dxc.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable

public class UserProduct {

	@Column(name = "productid")
	private Integer productId;
	@Column(name = "productname")
	private String productName;
	private int quantity;
	private double price;
	@Column(name = "totalpriceperitem")
	private double totalpricePerItem;
	private float discount;
	public UserProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserProduct(Integer productId, String productName, int quantity, double price, double totalpricePerItem,
			float discount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.totalpricePerItem = totalpricePerItem;
		this.discount = discount;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
	public double getTotalpricePerItem() {
		return totalpricePerItem;
	}
	public void setTotalpricePerItem(double totalpricePerItem) {
		this.totalpricePerItem = totalpricePerItem;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "UserProduct [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + ", totalpricePerItem=" + totalpricePerItem + ", discount=" + discount + "]";
	}

}
