/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author TOKO
 */
public class Cliente {
    private String id;
    private String nombre;
    private String telefono;

    public Cliente(String id, String Nombre, String Telefono) {
        this.id = id;
        this.nombre = Nombre;
        this.telefono = Telefono;
    }

    public Cliente() {
        this.id = "";
        this.nombre = "";
        this.telefono = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }
    
}
