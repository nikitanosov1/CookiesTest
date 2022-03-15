package ru.example.cookies.service.impl;

import org.springframework.stereotype.Service;
import ru.example.cookies.entity.Product;
import ru.example.cookies.repository.ProductRepository;
import ru.example.cookies.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }

    @Override
    public Product editProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
