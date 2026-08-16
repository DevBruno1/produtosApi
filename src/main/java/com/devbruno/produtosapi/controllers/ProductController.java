package com.devbruno.produtosapi.controllers;

import com.devbruno.produtosapi.models.Product;
import com.devbruno.produtosapi.repositories.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> findByName(@RequestParam("name") String name){
        return productRepository.findByName(name);
    }

//    @GetMapping
//    public List<Product> findAll(){
//        return productRepository.findAll();
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") UUID id) {
//        Optional<Product> product = productRepository.findById(id);
//        return product.isPresent() ? product.get() : null;
        return productRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") UUID id) {
         productRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") UUID id, @RequestBody Product product){
        product.setId(id);
        productRepository.save(product);
    }
}
