/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

/**
 * @author diego
 * @author tegui
 */
public class Jet extends VehiculoMotorizado {
    
    private String turbinas;
    private String alas;
    
    /**
     * metodo constructor jet con atributos de la clase VehiculoMotorizado
     * @param turbinas turbinas del jet
     * @param alas alas del jet
     * @param motor motor del jet
     * @param transmision transmision del jet
     * @param puerta puerta del jet
     * @param llantas llantas del jet
     * @param marca marca del jet
     * @param modelo modelo del jet
     * @param precio precio del jet
     */

    public Jet(String turbinas, String alas, String motor, String transmision, String puerta, String llantas, String marca, String modelo, String precio) {
        super(motor, transmision, puerta, llantas, marca, modelo, precio);
        this.turbinas = turbinas;
        this.alas = alas;
    }
    
    /**
     * metodo para ver turbinas del jet
     * @return turbinas String
     */

    public String getTurbinas() {
        return turbinas;
    }
    /**
     * metodo para actualizar turbinas del jet
     * @param turbinas nuevo turbinas
     */

    public void setTurbinas(String turbinas) {
        this.turbinas = turbinas;
    }
    /**
     * metodo para ver las alas del jet
     * @return alas String
     */

    public String getAlas() {
        return alas;
    }
    
    /**
     * metodo para actualizar las alas del jet
     * @param alas nuevo alas
     */

    public void setAlas(String alas) {
        this.alas = alas;
    }
    
    /**
     * metodo para usar jet llamada de la interface del metodo usarvehiculo
     */

    @Override
    public void usarVehiculo() {
        System.out.println("Usando Jet");
    }
     /**
     * metodo para guardar jet llamada de la interface del metodo guardarvehiculo
     */

    @Override
    public void guardarVehiculo() {
        System.out.println("Guardando Jet");
    }
    
    /**
     * metodo para imprimir jet
     */
    
    public void imprimirJet(){
        
        System.out.println("soy un jet");
        
    }
    
    
    
}
