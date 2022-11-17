package com.example.interface_repository.repository.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//run -> edit configurations

public class DatabaseConnectionManager {
    private static String hostname;
    private static String username;
    private static String password;

    private static Connection conn; //instantieres i try-catch

    private DatabaseConnectionManager(){ //tom for det forhindre bare instantiering, ikke andet
    }

    public static Connection getConnection(){ //alm metode kan kalde static metode?
        if(conn != null){
            return conn; //hvis Connection er instantiered så returner denne, så uanset hvor
            //mange gange getConnection kaldes så er det altid den samme Connection conn der fås
        }
        //fordel ved singleton over ren static metoder:
        //concurrency problemer - ved at bruge objekt fra singleton kan den kun
        //processe én process ad gangen, mens mange threads kan kalde den samme static metode
        //og få adgang til databaseadgangen
        //samt ved static kan der være problemer med at kalde static fra ikke-static context

        //hostname = "jdbc:mysql://localhost/webshop";
        //username = "root";
        //password = "1234";
        hostname = System.getenv("db.url");
        username = System.getenv("db.username");
        password = System.getenv("db.password");

        try {
            conn = DriverManager.getConnection(hostname, username, password);
            //laver Connection instantiering
            // øverst er Connection conn placeholder som instantieres her, det er Connection javaklassen
            //der instantieres, ikke DBconnectionManager
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
