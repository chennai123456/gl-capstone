package com.shopping.Inventory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.shopping.Inventory.model.Product;

@Component
public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByName(String name);

}
