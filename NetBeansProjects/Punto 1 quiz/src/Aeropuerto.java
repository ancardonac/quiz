/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Aeropuerto {
    private int veces;
    private String nombre;
    private String ubiacion;
    private int pistas;

    public Aeropuerto(String nombre, String ubiacion, int pistas) {
        this.nombre = nombre;
        this.ubiacion = ubiacion;
        this.pistas = pistas;
    }

    public String getNombre() {
        veces++;
        return nombre;
        
    }

    public String getUbiacion() {
        return ubiacion;
    }

    public int getPistas() {
        return pistas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbiacion(String ubiacion) {
        this.ubiacion = ubiacion;
    }

    public void setPistas(int pistas) {
        this.pistas = pistas;
    }
    public int getVeces(){
         
        return veces;
    

    
    }
    
    
    
    
}
