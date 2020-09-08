package com.dxc.shoppingcart.entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productid")
	private Integer productId;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name="productimage")
	private byte[] productImage;
	@Column(name="productname")
	private String productName;
	private int quantity;
	private double price;
	private float discount;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, byte[] productImage, String productName, int quantity, double price,
			float discount) {
		super();
		this.productId = productId;
		this.productImage = productImage;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public byte[] getProductImage() {
		return productImage;
	}
	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
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
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productImage=" + Arrays.toString(productImage) + ", productName="
				+ productName + ", quantity=" + quantity + ", price=" + price + ", discount=" + discount + "]";
	}

}
