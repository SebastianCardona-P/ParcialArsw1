package com.example.ARSW.Persistence;


import com.example.ARSW.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductPersistenceImplement implements ProductPersistence {

    private final List<Product> products=new ArrayList<>();

    public ProductPersistenceImplement(){
        //add some products
        Product product1 = new Product(147,"Manzana", 14.4);
        Product product2 = new Product(148,"Pera", 30.2);
        products.add(product1);
        products.add(product2);
    }
    /*
    private int generateId(){
        return null;
    }
    */


    @Override
    public void saveProduct(Product p){
        products.add(p);
    }

    @Override
    public List<Product> getAllProducts(){
        return products;
    }

    @Override
    public Product getById(int id){
        for(Product p:products){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
