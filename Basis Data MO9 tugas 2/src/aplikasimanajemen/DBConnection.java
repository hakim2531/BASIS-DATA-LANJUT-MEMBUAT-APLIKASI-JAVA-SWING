/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasimanajemen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

   public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/DB_MO9_09030624072";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
