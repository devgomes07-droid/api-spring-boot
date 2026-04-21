package com.educandoweb.springprimario.repositories;

import com.educandoweb.springprimario.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
