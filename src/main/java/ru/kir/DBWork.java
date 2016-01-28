package ru.kir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Kirill Zhitelev on 27.01.2016.
 */
public class DBWork {
    private static final String URL = "jdbc:postgresql://localhost:5432/Test";
    private static final String LOGIN = "";
    private static final String PASS = "";

    private static Connection connection;

    private DBWork() {

    }

    public static Connection getConnection() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(URL, LOGIN, PASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
