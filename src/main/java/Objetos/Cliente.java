/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author Vane
 */
public class Cliente {
    
    //atributos
    
   private Integer dni;
   private String nombre;
   private String direccion;
   
   //relacion de composicion 
   
  private ArrayList <Cuenta> cuenta;
  
  //metodo Tostring

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", cuenta=" + cuenta + '}';
    }
  
  
   //metodos

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCuenta(String de_ahorro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
