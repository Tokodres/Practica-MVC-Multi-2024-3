/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author TOKO
 */
public class Entrada {
    private Scanner sc;

    public Entrada(Scanner sc) {
        this.sc = sc;
    }

    public Entrada() {
        sc = new Scanner(System.in);
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    public int leerEntero(String c){       
        System.out.println(c);
        return sc.nextInt();
    }
    
    public String leerString(String c){
        System.out.println(c);
        return sc.next();
    }
    
    public float leerFlotante(String c){
        System.out.println(c);
        return sc.nextFloat();
    }
    
    public void mostrar(String c){
        System.out.println(c);
    }
    
}
