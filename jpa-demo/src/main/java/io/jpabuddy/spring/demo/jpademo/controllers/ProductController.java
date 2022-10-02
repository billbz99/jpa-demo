package io.jpabuddy.spring.demo.jpademo.controllers;


import io.jpabuddy.spring.demo.jpademo.dtos.ProductDto;
import io.jpabuddy.spring.demo.jpademo.entities.Product;
import io.jpabuddy.spring.demo.jpademo.mappers.ProductMapper;
import io.jpabuddy.spring.demo.jpademo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public ProductController(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @GetMapping("/product/find/{name}")
    public List<ProductDto> findByName(@PathVariable String name) {
        List<Product> productList = productRepository.findByProductName(name);
        return productList.stream()
                .map(productMapper::productToProductDto)
                .collect(Collectors.toList());
    }
}
