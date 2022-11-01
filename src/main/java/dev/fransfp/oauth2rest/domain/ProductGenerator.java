package dev.fransfp.oauth2rest.domain;

import com.github.javafaker.Faker;
import dev.fransfp.oauth2rest.domain.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductGenerator {

    private static Faker faker;

    public ProductGenerator(){
        this.faker = new Faker();
    }

    public Product generateProduct(){
        Product product = new Product();
        product.setId(faker.idNumber().valid());
        product.setName(faker.commerce().productName());
        product.setCurrency("IDR");
        product.setPrice(Float.valueOf(faker.commerce().price()));

        return product;
    }
}
