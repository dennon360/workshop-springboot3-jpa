package com.springproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
