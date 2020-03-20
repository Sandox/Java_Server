package com.sandile.server.controllers;

import com.sandile.server.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/category")
public class CategoryController {

    @GetMapping("get_random_joke")
    public ResponseEntity<String> category() {
        CategoryService categoryService = new CategoryService();
        return ResponseEntity.ok().body(categoryService.getRandomJoke());
    }//https://api.chucknorris.io/jokes/random?category={category}

    @GetMapping("get_all_categories")
    public ResponseEntity<String[]> allCategories() {
        CategoryService categoryService = new CategoryService();
        return ResponseEntity.ok().body(categoryService.getAllCategories());
    }

    @GetMapping("get_joke_by_category/{category}")
    public String getJokeByCategory(@PathVariable String category) {
        CategoryService categoryService = new CategoryService();
        return categoryService.getRandomJokeByCategory(category);
    }

    @GetMapping("search_query/{query}")
    public String searchJokeQuery(@PathVariable String query) {
        CategoryService categoryService = new CategoryService();
        return categoryService.searchQuery(query);
    }
}
