package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    //https://blablabla.com/products/15

//    @GetMapping("/{id}")
//    public String getProductById(@PathVariable("id") Long id){
//        return "Here is your product " + id;
//    }
    //http://localhost:8080/products/15 -->get req in postman
    //Here is your product 15

    @GetMapping("/{identity}/{text}")
    public String getProductById(@PathVariable("identity") Long id, @PathVariable("text") String x){
        return "Here is your product " + id + x;
    }


    //@RequestBody Product product--> converts the received json to Product java object.
    @PostMapping("")
    public String createProduct(@RequestBody Product product){
        System.out.println(product.getCategory());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        return "Product created.";
    }

}
