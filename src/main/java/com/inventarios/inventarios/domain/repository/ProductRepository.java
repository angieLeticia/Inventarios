package com.inventarios.inventarios.domain.repository;

import com.inventarios.inventarios.domain.ProductDominio;
import com.inventarios.inventarios.persistence.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<ProductDominio> getAll();
    Optional<List<ProductDominio>> getByCategoryD(int categoryIdD);
    Optional<ProductDominio> getProduct(int idProductD);
    ProductDominio save(ProductDominio productDominio);
    void delete(int idProductD);
}
