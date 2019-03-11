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
public class Patineta extends Vehiculo{
    
    private String tipoMadera;
    
    /**
     * metodo constructor patineta teniedi atributos de la clase Vehivulo
     * @param tipoMadera tipomadera de la patineta
     * @param llantas llantas d la patineta
     * @param marca marca de la patineta
     * @param modelo modelo da la patineta
     * @param precio precio de la patineta
     */

    public Patineta(String tipoMadera, String llantas, String marca, String modelo, String precio) {
        super(llantas, marca, modelo, precio);
        this.tipoMadera = tipoMadera;
    }
    
    /**
     * metetodo para ver tipomadera de la patineta
     * @return tipoMadera String
     */

    
    public String getTipoMadera() {
        return tipoMadera;
    }
    
    /**
     * metdodo actualizar tipoMadera de la patineta
     * @param tipoMadera nuevo tipoMadera
     */

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }
    
    /**
     * metodo para guardar patineta llamada de la interface del metodo guardarVehiculo
     */
  
    
    @Override
    public void guardarVehiculo() {
        System.out.println("Guardando Patineta");
    }
    /**
     * metodo para usar patineta llamada de la interface del metodo usarVehiculo
     */

    @Override
    public void usarVehiculo() {
        System.out.println("Usando Patineta");
    }
    
    /**
     * metodo para imprimir patineta
     */
    
    public void imprimirPatineta(){
    
        System.out.println("soy una patineta");
        
    }
    
}
