/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;


import java.sql.*;

/**
 *
 * @author Soporte
 */
public class Db {

    static String url = "jdbc:mysql://localhost:3306/mi_base";
    static String user = "root";
    static String pass = "root1234";

    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Coneccion exitosa");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return con;
    }

}
