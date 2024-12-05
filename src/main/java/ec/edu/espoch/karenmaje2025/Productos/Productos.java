/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.karenmaje2025.Productos;

/**
 *
 * @author SO-LAB1-PC24
 */
public class Productos {

    public String nombreProd;
    public float precio;
    public Categoria categoria;
    private static final double IVA = 0.12;
    public double calcularPrecioConIVA;
            
 

    public Productos(){
       
        
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public double calcularPrecioConIVA() {
        return precio * (1 + IVA);
  
    
    }
            
}
