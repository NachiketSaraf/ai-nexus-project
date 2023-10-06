package com.ai.nexus.backend.service;

import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<String> getAllCategoryNames() {
        return categoryRepository.findAllCategoryNames();
    }
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
