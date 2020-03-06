package com.project.omega.service;

import com.project.omega.bean.Product;
import com.project.omega.exceptions.NoRecordsFoundException;

import java.util.List;

public interface ProductService {

boolean createProduct(Product product);
List<Product> getAllProducts();
Product getProductById(Long id) throws NoRecordsFoundException;
boolean updateProduct(Long id, Product newProduct);
boolean deleteProductById(Long id);
}
