package org.example.service;

import org.example.data.entities.Product;
import org.example.data.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //Termékek lekérdezése
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    //Termék mentése
    public void save(Product product) {
        productRepository.save(product);
    }

    //Termék keresése ID alapján
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    //Termék törlése
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}