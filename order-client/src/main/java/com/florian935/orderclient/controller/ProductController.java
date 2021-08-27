package com.florian935.orderclient.controller;

import com.florian935.orderclient.domain.Product;
import com.florian935.orderclient.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("api/v1.0/products")
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class ProductController {

    ProductService productService;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(OK)
    List<Product> findAllProducts() {

        return productService.findAll();
    }

    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(OK)
    Product findAllProducts(@PathVariable Integer id) {

        return productService.findById(id);
    }
}
