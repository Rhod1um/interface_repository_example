package com.example.interface_repository.repository;

import com.example.interface_repository.model.Product;

import java.util.List;

public class GeneriskRepository<E> implements IGenericRepository<E>{
    //HUSK GENERISK DATATYPE E eller T
    //I normal klasse skal det stå to steder!!!
    //både efter klassenavn og interfacet

    //E kan være T og V og alle slags bogstaver åbenbart men E er standard

    //Generisk datatype gør at alle datatyper kan sættes ind

    //Kommer der E efter klassenavnet vil alle metoder i klassen skulle bruge E
    //Det er godt, for når man newer klassen et sted så bestemmer man datatypen dér
    //det er sådan man skal gøre
    //fx
    //IGenericRepository<Product> products = new GeneriskRepository<>();
    //IGenericRepository<Integer> ages = new GeneriskRepository<>();

    //Eller
    //IProductRepository<et-eller-andet> noget = new ProductInMemRepository();
    //hvis at IProductRepository og ProductInMemRepository var gjort til at have generisk datatype

    @Override
    public List<E> readAll() {
        return null;
    }

    @Override
    public E read() {
        return null;
    }

    @Override
    public void create(E p) {

    }

    @Override
    public void update(E p) {

    }

    @Override
    public void delete(int id) {

    }
}
