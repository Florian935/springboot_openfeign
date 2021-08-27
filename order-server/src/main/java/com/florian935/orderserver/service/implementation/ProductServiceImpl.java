package com.florian935.orderserver.service.implementation;

import com.florian935.orderserver.domain.Product;
import com.florian935.orderserver.repository.ProductRepository;
import com.florian935.orderserver.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {

        return productRepository.findById(id).get();
    }
}
