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

    static String url = "jdbc:mysql://localhost:3306/tienda_equipos";
    static String user = "root";
    static String pass = "root1234";

    public static Connection conectar() throws ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Coneccion exitosa");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return con;
    }
    public static void  cerrarCOnexion(Connection con){
        if(con !=null){
            try{
                con.close();
                System.out.println("CONEXION CERRADA");
            }catch (SQLException e){
                System.out.println("ERROR AL CERRAR: "+e.getMessage());
            }
        }
    }
}
