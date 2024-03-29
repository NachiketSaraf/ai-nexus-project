package com.ai.nexus.backend.controller;

import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.service.CategoryService;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin
@Tag(name = "Category Controller")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    // To get all categories as List<String>
    @GetMapping("/all")
    public List<String> getAllCategories() {
        return categoryService.getAllCategoriesNameOnly();
    }


}
