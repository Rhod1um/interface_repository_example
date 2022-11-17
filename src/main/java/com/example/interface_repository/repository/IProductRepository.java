package com.example.interface_repository.repository;

import com.example.interface_repository.model.Product;

import java.util.List;

public interface IProductRepository {

    //CRUD
    //Create
    //Read
    //Update
    //Delete

    //man vil have dette med ved læsning til databaser.
    //Interfacet skal have klasser med dette
    //Metoderne:

    //CREATE
    void create(Product product); //vil haves dynamisk, generisk datatype så alt kan indsættes,
    // se IGeneriskRepository

    //READ
    //Både read all og read én
    List<Product> readAll();
    Product read(int id);

    //UPDATE
    void update(Product product);

    //DELETE
    void delete(int id);


    //i wishing well - vi får webrequest og Model model ind ?
}
