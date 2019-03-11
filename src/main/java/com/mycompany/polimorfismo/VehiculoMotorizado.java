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
public abstract class VehiculoMotorizado extends Vehiculo {
    
   private String motor;
   private String transmision;
   private String puerta;
   
   /**
    * metodo constructor vehiculoMotorizado con atributos de la clase vehiculo
    * @param motor motor del vehiculoMotorizado
    * @param transmision transmision del vehiculoMotorizado
    * @param puerta puesta del vehiculoMotorizado
    * @param llantas llantas del vehiculoMotorizado
    * @param marca marca del vehiculoMotorizado
    * @param modelo modelo del vehiculoMotorizado
    * @param precio  precio del vehiculoMotorizado
    */

    public VehiculoMotorizado(String motor, String transmision, String puerta, String llantas, String marca, String modelo, String precio) {
        super(llantas, marca, modelo, precio);
        this.motor = motor;
        this.transmision = transmision;
        this.puerta = puerta;
    }
    
    /**
     * metodo para ver motor del vehiculoMotorizado
     * @return motor String
     */

   public String getMotor() {
        return motor;
   }
   
   /**
    * metodo para actualizar motor del vehiculoMotorizado
    * @param motor nuevo motor
    */

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    /**
     * metodo para ver trandmision del vehiculoMotorizado
     * @return 
     */

    public String getTransmision() {
        return transmision;
    }
    
    /**
     * metodo para actualizar transmision del vehiculoMotorizado
     * @param transmision nuevo transmision
     */

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    /**
     * metodo para ver puerta del vehiculoMotorizado
     * @return puerta String
     */

    public String getPuerta() {
        return puerta;
    }
    /**
     * metodo para actualizar puesta del vehiculoMotorizado
     * @param puerta 
     */

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }
    
    /**
     * metodo para usar vehiculo llamado de la interface
     */

    @Override
    public abstract void usarVehiculo();
     /**
     * metodo para guardar vehiculo llamado de la interface
     */
    @Override
    public abstract void guardarVehiculo();
    
    /**
     * metodo para imprimir VehiculoMotor
     */

    
    public void imprimirVehiculoMotor(){
        
        System.out.println("soy un vehiculo motorizado");
        
    }
   
   
    
}
