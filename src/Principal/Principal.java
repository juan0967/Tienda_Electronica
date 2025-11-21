/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Ventanas.VentanaPrincipal;
import Principal.Db;
import java.sql.Connection;

/**
 *
 * @author Soporte
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("==Probando conexion a MySql==");
        Connection con = Db.conectar();
        if (con != null) {
            System.out.println("Conexion exitosa Mysql");
            Db.cerrarCOnexion(con);
        } else {
            System.out.println("Erro:No se puede conecctar a Mysql");
        }
        // TODO code application logic here
        new VentanaPrincipal().setVisible(true);

//        Db dbc= new Db(); 
//        dbc.conectar();
    }

}
