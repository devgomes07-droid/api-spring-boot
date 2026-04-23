package com.educandoweb.springprimario.repositories;

import com.educandoweb.springprimario.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{
}
