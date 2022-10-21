package com.inventarios.inventarios.persistence.crud;

import com.inventarios.inventarios.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository <Product, Integer> {

    List<Product>findByIdCategory(int idCategory);

}
