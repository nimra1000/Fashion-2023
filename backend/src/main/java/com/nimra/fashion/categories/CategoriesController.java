package com.nimra.fashion.categories;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/categories")
public class CategoriesController {
    @GetMapping
    public ResponseEntity <List<Category>> GetCategories() {

        Category cat1 = new Category();
        cat1.setName("top");

        return ResponseEntity.ok(List.of(cat1));
    }
}
