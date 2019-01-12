package com.shopping.Inventory.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "products")
@SequenceGenerator(name = "seq_product", sequenceName = "seq_product", allocationSize = 1)
public class Product {

	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Product(Long id, String name, String image, BigDecimal price, String comments, Long quantity) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.comments = comments;
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", comments="
				+ comments + ", quantity=" + quantity + "]";
	}


	@Id
	@GeneratedValue(generator = "seq_product", strategy = GenerationType.SEQUENCE)
	@Column(name="product_id")
	private Long id;

	@Column(name="product_name")
	private String name;

	@Column(name="product_image")
	private String image;
	
	@Column(name="product_price")
	private BigDecimal price;
	
	@Column(name="product_comments")
	private String comments;

	@Column(name="product_stock")
	private Long quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public BigDecimal getprice() {
		return price;
	}

	public void setprice(BigDecimal price) {
		this.price = price;
	}
	
	public String getComments() {
		return comments;
	}



	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}



	


	
	
}
