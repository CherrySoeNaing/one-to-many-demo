package com.example.onetomanytest.Repository;

import com.example.onetomanytest.domain.Categoary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Locale;

@Repository
public interface CategoryRepository extends JpaRepository<Categoary, Long> {
}
