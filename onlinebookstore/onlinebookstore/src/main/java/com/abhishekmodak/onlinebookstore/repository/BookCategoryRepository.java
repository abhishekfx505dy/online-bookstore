package com.abhishekmodak.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.abhishekmodak.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookcategory", path="book-category") //to override the Json end point
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
