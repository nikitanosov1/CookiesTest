package ru.example.cookies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.example.cookies.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}