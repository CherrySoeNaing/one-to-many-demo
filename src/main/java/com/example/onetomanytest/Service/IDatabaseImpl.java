package com.example.onetomanytest.Service;

import com.example.onetomanytest.Repository.CategoryRepository;
import com.example.onetomanytest.Repository.ProductRepository;
import com.example.onetomanytest.domain.Categoary;
import com.example.onetomanytest.domain.Product;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class IDatabaseImpl implements IDatabase {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public IDatabaseImpl(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @Transactional
    public void createDatabase(){
        Categoary c1 = new Categoary();
        c1.setName("Fruits");

        Categoary c2 = new Categoary();
        c2.setName("Meats");

        Product p1 = new Product("Apple", 23, 2000);
        Product p2 = new Product("Cherry", 23, 2000);
        Product p3 = new Product("Chicken", 23, 2000);
        Product p4 = new Product("Pork", 23, 2000);

        p1.setCategoary(c1);
        p2.setCategoary(c1);

        p3.setCategoary(c2);
        p4.setCategoary(c2);

        categoryRepository.save(c1);
        categoryRepository.save(c2);

        productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4);
    }
}
