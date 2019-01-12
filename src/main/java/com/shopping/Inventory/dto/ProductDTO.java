package com.shopping.Inventory.dto;

import java.math.BigDecimal;

import com.shopping.Inventory.model.Product;


public class ProductDTO {

	private Long id;
	private String name;
	private String image;
	private BigDecimal price;
	private String comments;
	private Long quantity;

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Long id, String name, String image, BigDecimal price, String comments, Long quantity) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.comments = comments;
		this.quantity = quantity;
	}

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

	public Product toEntity() {
		return new Product(id, name, image, price, comments, quantity);
	}

	public static ProductDTO of(Product product) {
		return new ProductDTO(product.getId(), product.getName(),product.getImage(), product.getprice(),product.getComments(), product.getQuantity());
	}

}
