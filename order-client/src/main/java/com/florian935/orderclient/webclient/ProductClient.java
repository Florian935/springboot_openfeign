package com.florian935.orderclient.webclient;

import com.florian935.orderclient.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(value = "order-server", url = "http://localhost:8080/api/v1.0/products")
public interface ProductClient {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    List<Product> findAllProducts();

    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    Product findById(@PathVariable Integer id);
}
