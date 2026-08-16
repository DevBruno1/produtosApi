package com.devbruno.produtosapi.repositories;

import com.devbruno.produtosapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    List<Product> findByName(String name);
}
