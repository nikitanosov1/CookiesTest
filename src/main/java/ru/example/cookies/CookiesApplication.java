package ru.example.cookies;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.example.cookies.entity.Product;

@SpringBootApplication
public class CookiesApplication {
    public static void main(String[] args) {
        SpringApplication.run(CookiesApplication.class, args);

    }
}
