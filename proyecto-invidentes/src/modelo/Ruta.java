/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 * Representa una Ruta, compuesta por sus atributos, dos ubicaciones (origen y
 * destino)
 *
 * @author Alex Clemente < DAW >
 */
public class Ruta {

    Ubicacion origen;
    Ubicacion destino;
    ArrayList<String> instrucciones = new ArrayList<String>();

    public Ruta(Ubicacion origen, Ubicacion destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public Ubicacion getOrigen() {
        return origen;
    }

    public void setOrigen(Ubicacion origen) {
        this.origen = origen;
    }

    public Ubicacion getDestino() {
        return destino;
    }

    public void setDestino(Ubicacion destino) {
        this.destino = destino;
    }

    public ArrayList<String> getInstrucciones() {
        return instrucciones;
    }

    /**
     * Calcula las indicaciones para llegar al destino
     *
     * @return
     */
    public void calcularRuta() {
        /* Calcula todas las instrucciones y las añade al arraylist */
    }

}
