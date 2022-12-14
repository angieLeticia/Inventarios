package com.inventarios.inventarios.persistence;

import com.inventarios.inventarios.persistence.crud.ProductCrudRepository;
import com.inventarios.inventarios.persistence.entity.Product;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;
@Repository
public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(int idCategory){
        return productCrudRepository.findByIdCategory(idCategory);
    }
    public Optional<Product> getProduct(int idProduct){
        return productCrudRepository.findById(idProduct);
    }

    public Product save (Product product){
        return productCrudRepository.save(product);
    }

    public void  delete(int idProduct){
        productCrudRepository.deleteById(idProduct);
    }
}
