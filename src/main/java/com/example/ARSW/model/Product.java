package com.example.ARSW.model;


public class Product {
    private int id;

    private String name;

    private Double precio;


    public Product(int id, String name, Double precio){
        this.id = id;
        this.name = name;
        this.precio = precio;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Double getPrecio(){
        return precio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrecio(String name) {
        this.precio = precio;
    }

    public void setId(int id) {
        this.id = id;
    }
}
