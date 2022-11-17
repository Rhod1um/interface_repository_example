package com.example.interface_repository.repository;

import com.example.interface_repository.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductInMemRepository implements IProductRepository { //højreklik for at IntelliJ
    //selv tager metoderne i interfacet ind
    //Skal have E på begge hvis generisk datatype skal bruges når ting puttes i klassen
    //Klassen afgør det, interfacet tillader bare klassen selv at vælge med E

    private List<Product> products;

    public ProductInMemRepository(){
        products = new ArrayList<>();
        //til test:
        products.add(new Product(1, "bottle", 12));
        products.add(new Product(2, "milk", 12));
        products.add(new Product(3, "plant", 12));
    }

    @Override
    public void create(Product product) {

    }

    @Override
    public List<Product> readAll() {
        return products;
    }

    @Override
    public Product read(int id) {
        return products.get(id-1); //id-1 for at få index 0 ved id 1. id 1 er på plads 0 i listen
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
