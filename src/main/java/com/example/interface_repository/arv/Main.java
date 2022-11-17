package com.example.interface_repository.arv;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square("Square", 12, 12);
        //instantier yd fra overklassen, så shape først
        //fordel: man kan lave lister af shapes som tager forskellige shapes frem for kun én
        //samme med metode-parameterliste: kan tage flere undertyper
        //samt som med List = new arraylist, det er nemt at ændre listen til linkedlist hvis man
        //hellere vil bruge dét
        //listerne er dog inerfaces men samme princip
        System.out.println(square);
    }
}
