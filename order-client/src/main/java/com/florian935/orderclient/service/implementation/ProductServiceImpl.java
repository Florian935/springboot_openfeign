package com.florian935.orderclient.service.implementation;

import com.florian935.orderclient.domain.Product;
import com.florian935.orderclient.service.ProductService;
import com.florian935.orderclient.webclient.ProductClient;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class ProductServiceImpl implements ProductService {

    ProductClient productClient;

    @Override
    public List<Product> findAll() {

        return productClient.findAllProducts();
    }

    @Override
    public Product findById(Integer id) {

        return productClient.findById(id);
    }
}
