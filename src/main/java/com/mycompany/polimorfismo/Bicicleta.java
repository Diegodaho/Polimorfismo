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
public class Bicicleta extends Vehiculo {
    
   private String marco;
   private String pedales;
   /**
    * metodo Constructor de Bicicleta con atributos de  Vehiculo
    * @param marco marco de la bicicleta
    * @param pedales pedales de la bicicleta
    * @param llantas llantas de bicicleta
    * @param marca marca de bicicleta
    * @param modelo modelo de bicicleta
    * @param precio  precio de bicicleta
    */

    public Bicicleta(String marco, String pedales, String llantas, String marca, String modelo, String precio) {
        super(llantas, marca, modelo, precio);
        this.marco = marco;
        this.pedales = pedales;
    }
    
    /**
     * metodo para ver marco de la bicicleta
     * @return marco String
     */

    public String getMarco() {
        return marco;
    }
    /**
     * metodo para actualizar marco de bicicleta
     * @param marco nuevo bicicleta
     */

    public void setMarco(String marco) {
        this.marco = marco;
    }
    
    /**
     * metodo para ver pedales de bicicleta
     * @return pedales String
     */

    public String getPedales() {
        return pedales;
    }
    /**
     * metodo para actualizar pedales de bicicleta
     * @param pedales 
     */

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }
    /**
     * metodo para gauardar bicileta que posterior mente 
     * se llamo de la interface
     * 
     */

    @Override
    public void guardarVehiculo() {
        System.out.println("Guardando Bicicleta");
    }
    
     /**
     * metodo para usar bicileta que posterior mente 
     * se llamo de la interface
     * 
     */

    @Override
    public void usarVehiculo() {
        System.out.println("Usando Bicicleta");
    }
    /**
     * metodo para imprimir Bicicleta
     */
    
    public void imprimirBicicleta(){
        
        System.out.println("soy una bicicleta");
        
    }
   
   
    
}
