/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;


    
public class Aerolinea {
    
    private String nombre;
    private ArrayList<Vuelo> vuelos;
    private ArrayList<Aeropuerto> aeropuertos;

    public Aerolinea(String nombre) {
        this.nombre = nombre;
        this.vuelos = new ArrayList <Vuelo>();
        this.aeropuertos = new ArrayList <Aeropuerto>();
        
        
        
    }
    
    public void listarAeropuertos(){
    
        for (int i = 0; i <vuelos.size(); i++) {
            
            System.out.println("vuelo # " + vuelos.get(i).getNumero() + "de aeropuerto"  +  vuelos.get(i).getInicio().getNombre() + "hacia"+ vuelos.get(i).getDestino().getNombre());
            
            
        }
        
    
 
    
    
    
    }
    
    public String masInicios(){
        int posicion=0;
        for (int i = vuelos.size(); i >1 ; i++) {
           
            if(vuelos.get(i).getInicio().getVeces()>vuelos.get(i-1).getInicio().getVeces())
            posicion=i;
            
           
        }
    
    return vuelos.get(posicion).getInicio().getNombre();
    
    
    }
    
    
    
    
    
    
    
}
