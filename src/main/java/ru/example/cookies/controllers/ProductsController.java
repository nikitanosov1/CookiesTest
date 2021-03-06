package ru.example.cookies.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.example.cookies.entity.Product;
import ru.example.cookies.service.ProductService;

import java.util.List;

@RestController
public class ProductsController {
    private final ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/index")
    public String index(){
        return "hello";
    }

    @GetMapping("/{id}")
    public Product showById(@PathVariable("id") Long id){
        return productService.getById(id);
    }

    @GetMapping()
    public List<Product> showAll(){
        return productService.getAll();
    }

    @PostMapping("/add")
    public Product add(@RequestBody Product product){
        System.out.println(product);
        return productService.addProduct(product);
    }

    @GetMapping("/del")
    public void del(){
        productService.deleteAll();
    }


}
