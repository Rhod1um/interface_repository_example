package com.example.interface_repository.repository.util;

import java.sql.Connection;

public class main {
    public static void main(String[] args) { //for test at DB connectionM ikke kan instatieres
        Connection conn = DatabaseConnectionManager.getConnection();
        DatabaseConnectionManager.getConnection();
        DatabaseConnectionManager.getConnection();
    }
}
