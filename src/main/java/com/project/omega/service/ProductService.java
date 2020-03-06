package com.project.omega.service;

import com.project.omega.bean.Product;
import com.project.omega.exceptions.NoRecordsFoundException;
import com.project.omega.exceptions.ProductNotFoundException;

import java.util.List;

public interface ProductService {

boolean createProduct(Product product);
List<Product> getAllProducts() throws NoRecordsFoundException;
List<Product> getProductsAbovePrice(int price) throws NoRecordsFoundException;
List<Product> getProductsBelowPrice(int price) throws NoRecordsFoundException;
List<Product> getProductsEqualPrice(int price) throws NoRecordsFoundException;
Product getProductById(Long id) throws ProductNotFoundException;
List<Product> getProductsBySearchQuery(String name) throws NoRecordsFoundException;
boolean updateProduct(Long id, Product newProduct);
boolean deleteProductById(Long id);
}
