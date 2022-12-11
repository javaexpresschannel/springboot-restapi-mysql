package com.javaexpress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaexpress.models.Category;
import com.javaexpress.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public void save(Category category) {
		categoryRepository.save(category);
		log.info("category input object is saved in database");
	}

	public List<Category> findAllCategories() {
		return categoryRepository.findAll();
	}

}
