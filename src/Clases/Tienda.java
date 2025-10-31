/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tyron
 */
public class Tienda implements Serializable {
    private String nombre;
    private String ruc;
    private String direccion;
    private ArrayList<Equipo> listado;

    public Tienda(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        listado = new ArrayList();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void addEquipo(Equipo equipo) {
        this.listado.add(equipo);
    }
    
    public void eliminarEquipo(int indice) {
        this.listado.remove(indice);
    }

    public ArrayList<Equipo> getListado() {
        return listado;
    }
    
    public ArrayList<Equipo> getListadoTipo(String tipo) {
        ArrayList<Equipo> lista = new ArrayList();
        for(Equipo e : listado) {
            System.out.println(e.getTipo().equalsIgnoreCase(tipo));
            if(e.getTipo().equalsIgnoreCase(tipo)) {
                lista.add(e);
            }
        }
        return lista;
    }
    
    public ArrayList<Equipo> getListadoMarca(String marca) {
        ArrayList<Equipo> lista = new ArrayList();
        for(Equipo e : listado) {
            if(e.getMarca().equalsIgnoreCase(marca)) {
                lista.add(e);
            }
        }
        return lista;
    }
    public ArrayList<Equipo> getListadoProcesador(String procesador) {
        ArrayList<Equipo> lista = new ArrayList();
        for(Equipo e : listado) {
            if(e.getProcesador().equalsIgnoreCase(procesador)) {
                lista.add(e);
            }
        }
        return lista;
    }
}
