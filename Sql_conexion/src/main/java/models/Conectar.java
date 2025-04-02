
package models;


import java.sql.*;

public class Conectar {
    private static final String URL = "jdbc:mysql://localhost:3306/javam?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "";

    private Connection con;

    // Constructor que establece la conexión
    public Conectar() {
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectado a la base de datos");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la conexión
    public Connection getConnection() {
        return con;
    }
}

