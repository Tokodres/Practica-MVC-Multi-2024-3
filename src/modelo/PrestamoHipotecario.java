/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author TOKO
 */
public class PrestamoHipotecario {
    private Cliente cliente;
    private String nroPrestamo;
    private int valorPrestamo;
    private int cantAños;

    public PrestamoHipotecario() {
    }

    public PrestamoHipotecario(Cliente cliente, String nroPrestamo, int valorPrestamo, int cantAños) {
        this.cliente = cliente;
        this.nroPrestamo = nroPrestamo;
        this.valorPrestamo = valorPrestamo;
        this.cantAños = cantAños;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNroPrestamo() {
        return nroPrestamo;
    }

    public void setNroPrestamo(String nroPrestamo) {
        this.nroPrestamo = nroPrestamo;
    }

    public int getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(int valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    public int getCantAños() {
        return cantAños;
    }

    public void setCantAños(int cantAños) {
        this.cantAños = cantAños;
    }
    
    public double calculoPrimeraCuota(){
        return (this.valorPrestamo * ((10.5/100)/12) * Math.pow(1 + ((10.5/100)/12), ((10.5/100)*12)));
    }
    
    public double calculartotalPago(){
        return (this.valorPrestamo * (10.5/100) * this.cantAños);
    }
}
