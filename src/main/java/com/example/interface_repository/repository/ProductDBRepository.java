package com.example.interface_repository.repository;

import com.example.interface_repository.model.Product;
import com.example.interface_repository.repository.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDBRepository implements IProductRepository {

    private Connection conn = DatabaseConnectionManager.getConnection(); //bruger singleton-klasse
    //til at få Connection som skal bruges til sql sætningerne, til at conecte til databsen
    @Override
    public void create(Product product) { //evt lav generisk datatype her
        //og andre metoder med bestemte datatyper så man ikke er låst

    }

    @Override
    public List<Product> readAll() {
        return null;
    }

    @Override
    public Product read(int id) { //alt her er kopieret fra snippet.txt i ressourcer i roden
        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * from product WHERE id = ?");
            psts.setInt(1 , id);
            ResultSet resultSet = psts.executeQuery();
            if(resultSet.next()){
                return new Product(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getDouble("price")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new Product();
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
