/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Vuelo {
    private int numero;
    private Aeropuerto inicio;
    private Aeropuerto destino;

    public Vuelo(int numero, Aeropuerto inicio, Aeropuerto destino) {
        this.numero = numero;
        this.inicio = inicio;
        this.destino = destino;
    }

    public int getNumero() {
        return numero;
    }

    public Aeropuerto getInicio() {
        return inicio;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setInicio(Aeropuerto inicio) {
        this.inicio = inicio;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    
    
        
    
    
    
}
