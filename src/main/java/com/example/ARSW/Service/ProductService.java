package com.example.ARSW.Service;

import com.example.ARSW.Persistence.ProductPersistenceImplement;
import com.example.ARSW.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductPersistenceImplement p;


    public List<Product> getAll(){
        return p.getAllProducts();
    }

    public Product getById(int id){
        return p.getById(id);
    }

    public void saveProduct(Product product){
        p.saveProduct(product);
    }
}
