package dev.fransfp.oauth2rest.controller;

import dev.fransfp.oauth2rest.domain.ProductGenerator;
import dev.fransfp.oauth2rest.domain.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = {"${app.security.cors.origin}"})
@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductGenerator productGenerator;

    public ProductController(ProductGenerator productGenerator){
        this.productGenerator = productGenerator;
    }

    @GetMapping(path = {"","/"})
    public List<Product> products(){
        List<Product> products = new ArrayList<>();

        int numberOfProduct = 10;
        for (int i = 0; i< numberOfProduct; i++){
            products.add(productGenerator.generateProduct());
        }

        return products;
    }

}
