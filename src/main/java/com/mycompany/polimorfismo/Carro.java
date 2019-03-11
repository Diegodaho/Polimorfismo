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
public class Carro extends VehiculoMotorizado {
    
    private String marchas;
    private String tipoGasolina;
    
    /**
     * Metodo constructor carro que tiene atributos de VehiculoMotorizado
     * @param marchas marchas de carro
     * @param tipoGasolina tipodegasolina carro
     * @param motor motor del carro
     * @param transmision transmision carro
     * @param puerta puerta carro
     * @param llantas llantas carro
     * @param marca marca carro
     * @param modelo modelo carro
     * @param precio precio carro
     */

    public Carro(String marchas, String tipoGasolina, String motor, String transmision, String puerta, String llantas, String marca, String modelo, String precio) {
        super(motor, transmision, puerta, llantas, marca, modelo, precio);
        this.marchas = marchas;
        this.tipoGasolina = tipoGasolina;
    }
    /**
     * metodo para ver marchas de carro
     * @return marchas String
     */
    
    public String getMarchas() {
        return marchas;
    }
    /**
     * metodo para actualizar marchas de carro
     * @param marchas nuevo marchas
     */

    public void setMarchas(String marchas) {
        this.marchas = marchas;
    }
    /**
     * metodo para ver tipoGasolina del carro
     * @return tipoGasolina String
     */

    public String getTipoGasolina() {
        return tipoGasolina;
    }
    /**
     * metodo para actualizar tipogasolina de carro
     * @param tipoGasolina nuevo tipoGasolina
     */

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }
    
    /**
     * metodo para usar carro LLamado del la interface como usar Vehiculo
     */

    @Override
    public void usarVehiculo() {
        System.out.println("Usando Carro");
    }
     /**
     * metodo para guardar carro LLamado del la interface del metodo guardar Vehiculo
     */

    @Override
    public void guardarVehiculo() {
        System.out.println("Guardando Carro");
    }
    
    /**
     * metodo para imprimir carro
     */
    
    public void imprimirCarro(){
        
        System.out.println("soy un carro");
        
    }
    
    
    
    
}
