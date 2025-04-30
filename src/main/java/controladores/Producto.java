/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Personal
 */
public class Producto {
    private int id;
    private String  nombre;
    private double precio;
    private String categoria;

    public Producto(int id, String nombre, double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    private Producto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public static List<Producto> generarProductos(int cantidad){
        List<Producto> productos = new ArrayList<>();
        String[] categorias = {"Electronica", "Ropa", "Hogar", "Alimentos", "Juguetes"};
        
        for(int i = 1; i <= cantidad; i++){
                Producto p = new Producto();
                p.setId(i);
                p.setNombre("Producto " + i);
                p.setPrecio(10 + Math.random() * 90);
                p.setCategoria(categorias[i % categorias.length]);
                productos.add(p);
        }
        return productos;
    }
}
