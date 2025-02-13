/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestionproductos.controlador;

import ec.edu.espoch.gestionproductos.vista.Vista;


/**
 *
 * @author SO-LAB-PC5
 */
public class Controlador {
    private Vista vista;
 
   
    public Controlador(Vista gestorproducto) {
        this.vista = Gestorproducto;
        
    }
    public void agregarProducto() {

        try {
            if (this.vista != null) {
                Producto objproducto = new producto();
                objproducto.setTitulo(this.vista.getNombre());
                objproducto.setDescripcion(this.vista.getPrecio());
                objproducto.setEstado(this.vista.getDisponibilidad());
                GestorProducto.prueba(objproducto);

            } else {
            GestorProducto.error("No agregado , ingresa bien los datos");
            }
        }
    }
    
}
        
    

       
  
  

