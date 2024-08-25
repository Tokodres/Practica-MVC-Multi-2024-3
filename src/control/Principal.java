/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.Cliente;
import modelo.PrestamoHipotecario;
import vista.Entrada;


public class Principal {
    Entrada en = new Entrada();
    public static void main(String[] args) {
        Principal pc = new Principal();
        pc.principal();
    }
    
    
    public void principal(){
        String id,Nombre,Telefono,Nroprestamo;
        int valor = 0,cantidad = 0;
        id = en.leerString("Identificacion: ");
        Nombre = en.leerString("Nombre: ");
        Telefono = en.leerString("Telefono: ");
        Nroprestamo = en.leerString("Numero Prestamo: ");
           
        while(valor <= 0 && cantidad <= 0){
            valor = en.leerEntero("valor de Prestamo: ");
            cantidad = en.leerEntero("Cantidad de años: ");
        }
                  
        Cliente cl = new Cliente(id, Nombre, Telefono);
        PrestamoHipotecario ph = new PrestamoHipotecario(cl, Nombre, valor, cantidad);
       
        en.mostrar("Primera cuota: "+ph.calculoPrimeraCuota());
        en.mostrar("Total a pagar: "+ph.calculartotalPago());
        
        
        
        
    }
}
