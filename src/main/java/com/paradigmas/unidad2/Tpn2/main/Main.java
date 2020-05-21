/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paradigmas.unidad2.Tpn2.main;

import Objetos.Cliente;

/**
 *
 * @author Vane
 */
public class Main {
    
    public static void main (String [] args ){
        //declaramos la variable del tipo cliente cliente
        Cliente cliente;
        //instaciando la clase cliente y le dimos valores
        cliente= new Cliente ();
        
        cliente.setDni(12345678);
        cliente.setDireccion ("Av. San Nicolas de Bari");
        cliente.setNombre ("Florencia Bazan");
        
        
      //Imprimir datos
        System.out.println(cliente);        
        
    }
   
    
}
