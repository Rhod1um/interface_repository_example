package com.example.interface_repository.repository;

import java.util.List;

public interface IGenericRepository<E> { //HUSK GENERISK DATATYPE <E>
    //gøres så det er dynamisk, alle datatyper kan indsættes
    //Claus bruger <E> fordi det gøres i Lister men han ville normalt bruge <T>
    //Kan bruge alle bogstaver, også V, men E er standard

    List<E> readAll();
    E read(); //dynamisk returtype

    void create(E p);

    void update(E p);

    void delete(int id);

}
