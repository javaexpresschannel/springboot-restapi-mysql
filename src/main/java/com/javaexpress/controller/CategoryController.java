package com.javaexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpress.models.Category;
import com.javaexpress.services.CategoryService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/category/api/v1")
@Slf4j
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@ResponseStatus(code=HttpStatus.CREATED)
	@PostMapping
	public void saveCategory(@RequestBody Category inputCategory) {
		log.info("CategoryController saveCategory method is executed"); 
		categoryService.save(inputCategory);
	}
	
	@GetMapping
	public List<Category> fetchAllCategories() {
		log.info("CategoryController fetchAllCategories method is executed"); 
		return categoryService.findAllCategories();
	}
	
	
}
