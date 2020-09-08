package com.dxc.shoppingcart.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dxc.shoppingcart.model.UserProduct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7046907332782399492L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="orderid")
	private Integer orderId;

	@ElementCollection
	@CollectionTable(name="userproducts")
	private List<UserProduct> productList;
	@Column(name="totalcost")
	private double totalCost;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer orderId, List<UserProduct> productList, double totalCost) {
		super();
		this.orderId = orderId;
		this.productList = productList;
		this.totalCost = totalCost;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public List<UserProduct> getProductList() {
		return productList;
	}
	public void setProductList(List<UserProduct> productList) {
		this.productList = productList;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productList=" + productList + ", totalCost=" + totalCost + "]";
	}

}
