package com.educandoweb.springprimario.services;

import com.educandoweb.springprimario.entities.Category;
import com.educandoweb.springprimario.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Category insert(Category obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Category update(Long id, Category obj) {
        Category entity = repository.findById(id).orElseThrow();
        entity.setName(obj.getName());
        return repository.save(entity);
    }
}