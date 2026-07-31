package com.scrr.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrr.project.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
