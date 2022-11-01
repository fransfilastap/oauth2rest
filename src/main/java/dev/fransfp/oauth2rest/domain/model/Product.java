package dev.fransfp.oauth2rest.domain.model;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String description;
    private float price;
    private String currency;
}
