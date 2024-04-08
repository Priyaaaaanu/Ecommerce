package com.ecommerce.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    //entities in product model.
    private Long id;

    private String name;

    private String description;

    private Double price;

    private String imageURL;

    private String category;

}
