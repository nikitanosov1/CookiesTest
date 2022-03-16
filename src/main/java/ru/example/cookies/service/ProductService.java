package ru.example.cookies.service;

import ru.example.cookies.entity.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    void deleteAll();
    Product editProduct(Product product);
    List<Product> getAll();
    Product getById(Long id);
}
