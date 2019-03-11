/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tegui
 */
public class Principal {
    
    public void principal1(){
    
        Carro carro1 = new Carro("","","","","","","Mazda","","");//metodo costructor de la clase Carro
        Carro carro2 = new Carro("","","","","","","Ford","","");//metodo costructor de la clase Carro
    
        Jet jet1 = new Jet("","","","","","","Airbus","","");//metodo costructor de la clase Jet
        Jet jet2 = new Jet("","","","","","","Bombardier","","");//metodo costructor de la clase jet
      
        Patineta patineta1 = new Patineta("","","Zero","","");//metodo costructor de la clase patineta
        Patineta patineta2 = new Patineta("","","Powell","","");//metodo costructor de la clase patineta
    
        Bicicleta bicicleta1 = new Bicicleta("","","","Trek","","");//metodo costructor de la clase bicicleta
        Bicicleta bicicleta2 = new Bicicleta("","","","GW","","");//metodo costructor de la clase bicicleta
    
        
    //creacion de lista Vehiculos
        List<Vehiculo> vehiculos = new ArrayList<>();
    //creacion de lista con relacion a las demas clases que tiene atributos de Vehiculos
        vehiculos.add(carro1);
        vehiculos.add(carro2);
        vehiculos.add(jet1);
        vehiculos.add(jet2);
        vehiculos.add(bicicleta1);
        vehiculos.add(bicicleta2);
        vehiculos.add(patineta1);
        vehiculos.add(patineta2);
        
      //recorre las listas 
        for (Vehiculo listaTemporal:vehiculos){
            
            if (listaTemporal instanceof Carro){
           //imprime carro
                Carro car1 = (Carro) listaTemporal;
                System.out.println("marca: "+car1.getMarca());
                car1.imprimirVehiculo();
                car1.imprimirVehiculoMotor();
                car1.imprimirCarro();
                car1.usarVehiculo();
                car1.guardarVehiculo();
                System.out.println("-----------------------------");
                
            }
            else if (listaTemporal instanceof Jet){
            //imprime jet
                Jet jett1 = (Jet) listaTemporal;
                System.out.println("marca: "+jett1.getMarca());
                jett1.imprimirVehiculo();
                jett1.imprimirVehiculoMotor();
                jett1.imprimirJet();
                jett1.usarVehiculo();
                jett1.guardarVehiculo();
                System.out.println("-----------------------------");
                
            }
            else if (listaTemporal instanceof Bicicleta){
            //imprime bicicleta
                Bicicleta bike1 = (Bicicleta) listaTemporal;
                System.out.println("marca: "+bike1.getMarca());
                bike1.imprimirVehiculo();
                bike1.imprimirBicicleta();
                bike1.usarVehiculo();
                bike1.guardarVehiculo();
                System.out.println("-----------------------------");
                
            }
            else if (listaTemporal instanceof Patineta){
            //imprime patineta
                Patineta board1 = (Patineta) listaTemporal;
                System.out.println("marca: "+board1.getMarca());
                board1.imprimirVehiculo();
                board1.imprimirPatineta();
                board1.usarVehiculo();
                board1.guardarVehiculo();
                System.out.println("-----------------------------");
            }
        }
    }
    
}
