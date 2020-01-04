package com.example.onetomanytest.Service;

import com.example.onetomanytest.Repository.CategoryRepository;
import com.example.onetomanytest.domain.Categoary;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Categoary save(Categoary category) {
        return categoryRepository.save(category);
    }
}
