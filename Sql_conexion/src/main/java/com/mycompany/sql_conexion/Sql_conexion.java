
package com.mycompany.sql_conexion;

import java.sql.*;
import java.sql.Connection;
public class Sql_conexion {

    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/java?serverTimezone=UTC";
        String user = "root";
        String pass = "";

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Conexion exitosa.");
        } catch (SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
    }
}
