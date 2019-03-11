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
public abstract class Vehiculo implements Interface {
    
    private String llantas;
    private String marca;
    private String modelo;
    private String precio;
    
    /**
     * metodo constructor vehiculo 
     * @param llantas llantas del vehiculo
     * @param marca marca del vehiculo
     * @param modelo modelo del vehiculo
     * @param precio precio del vehiculo
     */

    public Vehiculo(String llantas, String marca, String modelo, String precio) {
        this.llantas = llantas;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    /**
     * metodo para ver llantas de vehiculo
     * @return llantas String
     */

    public String getLlantas() {
        return llantas;
    }
    
   /**
    * metodo para actualizar llantas de vehiculo
    * @param llantas nuevo vehiculo 
    */
    

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }
    /**
     * metodo para ver marca de vehiculo
     * @return marca String
     */

    public String getMarca() {
        return marca;
    }
    /**
     * metodo para actualizar marca del vehiculo 
     * @param marca nuevo marca
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * metodo para ver modelo de vehiculo
     * @return modelo String
     */
   

    public String getModelo() {
        return modelo;
    }
    
    /**
     * metodo para actualizar vehiculo
     * @param modelo nuevo model
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * metodo para ver precio de vehiculo
     * @return precio String
     */

    public String getPrecio() {
        return precio;
    }
    /**
     * metodo para actualizar precio vehiculo
     * @param precio nuevo precio
     */

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    /**
     * metodo para guardarvehiculo llamada de la interface
     */

    @Override
    public abstract void guardarVehiculo();
    
    /**
     * metodo para usarvehiculo llamada de la interface
     */

    @Override
    public abstract void usarVehiculo();
    
    /**
     * metodo para imrpimir Vehiculo
     */
    public void imprimirVehiculo(){
        
        System.out.println("soy un vehiculo");
        
    }
    
    
}
