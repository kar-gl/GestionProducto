/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestionproductos.TesterVista;

/**
 *
 * @author SO-LAB-PC6
 */
public class TesterVista {
    private Vista vista;
    public TesterVista(Vista vista){
        this.vista=vista;
    }
    public void prueba(){
        System.out.println("Nombre: "+vista.get.Nombre());
        System.out.println("Precio: "+vista.get.Precio());
        System.out.println("Disponibilidad: "+vista.get.Disponibilidad());
        
    }
}
