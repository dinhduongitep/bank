package com.vpbank.banksystemserver.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class DatabaseConfig {
    public static Connection getConnection() {
        Connection conn = null;

        try (FileInputStream f = new FileInputStream("src/main/java/db.properties")) {
            // load the properties file
            Properties pros = new Properties();
            pros.load(f);
            // assign db parameters
            String url = pros.getProperty("url");
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");
            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful !");
        } catch (IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
