package com.sandile.server.services;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CategoryService {

    public String getRandomJoke() {
        String url = "https://api.chucknorris.io/jokes/random";
        //helping hitting external services
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity =  restTemplate.getForEntity(url,String.class);
        return responseEntity.getBody();
    }

    public String[] getAllCategories() {
        String url = "https://api.chucknorris.io/jokes/categories";
        //helping hitting external services
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String[]> responseEntity =  restTemplate.getForEntity(url,String[].class);
        return responseEntity.getBody();
    }

    public String getRandomJokeByCategory(String category) {
        String url = "https://api.chucknorris.io/jokes/random?category=" + category;
        //helping hitting external services
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity =  restTemplate.getForEntity(url,String.class);
        return responseEntity.getBody();
    }

    public String searchQuery(String query) {
        String url = "https://api.chucknorris.io/jokes/search?query=" + query;
        //helping hitting external services
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity =  restTemplate.getForEntity(url,String.class);
        return responseEntity.getBody();
    }

}
