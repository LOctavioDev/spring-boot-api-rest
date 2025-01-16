package com.octadev.apirest.apirest.Repositories;

import com.octadev.apirest.apirest.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
