package com.example.interface_repository.repository;

import com.example.interface_repository.model.Product;

import java.util.ArrayList;

public class main { //test Product interface ting
    public static void main(String[] args) {
        //IProductRepository prod = new ProductInMemRepository();
        //^ viser produkter i arraliste for eksempelvisninh i klassen, hvor næste connecter
        //til databasen
        IProductRepository prod = new ProductDBRepository();
        //her har den interfacet først, ligesom med arv og med List = new Arraylist
        System.out.print(prod.readAll());
        System.out.print(prod.read(1));

        //ArrayList<String> names = new ArrayList<>();
        //ArrayList<Product> products = new ArrayList<>();
        //ArrayList<Integer> ages = new ArrayList<>();
        //Man kan bruge alle datatyper i arrayliste, String, Product, Integer osv
        //fordi arrayliste er lavet med generisk datatype, så alt kan puttes ind
        //vi gør det samme med IGeneriskRepository interface

        IGenericRepository<String> names = new GeneriskRepository<>();
        //først interface for dynamisk, og normal klasse efterfølgende, som List og Arraylist
        //pga generisk datatype i både interfacet og klassen kan alt sættes ind i <>
        //klassen kunne have bestemt datatype og så ville det kun være dét der kunne sættes ind

        //Man vil ikke bruge Object som generisk datatype for det
        //upcaster til object mister underklasssespecifikke ting, sker ikke med E
        IGenericRepository<Product> products = new GeneriskRepository<>();
        IGenericRepository<Integer> ages = new GeneriskRepository<>();

    }
}
