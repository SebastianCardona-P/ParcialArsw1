package com.example.ARSW.Persistence;

import com.example.ARSW.model.Product;

import java.util.List;

public interface ProductPersistence {


    public void saveProduct(Product p);

    public List<Product> getAllProducts();

    public Product getById(int id);

}
