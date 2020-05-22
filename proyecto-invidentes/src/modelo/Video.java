/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author nacho
 */
public class Video {

    String nombre;
    String formato;
    String audioOriginal;
    String audioNarracion;

    /**
     * Constructor con todas las propiedades
     *
     * @param nombre
     * @param formato
     * @param audioOriginal
     * @param audioNarracion
     */
    public Video(String nombre, String formato, String audioOriginal, String audioNarracion) {
        this.nombre = nombre;
        this.formato = formato;
        this.audioOriginal = audioOriginal;
        this.audioNarracion = audioNarracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getAudioOriginal() {
        return audioOriginal;
    }

    public void setAudioOriginal(String audioOriginal) {
        this.audioOriginal = audioOriginal;
    }

    public String getAudioNarracion() {
        return audioNarracion;
    }

    public void setAudioNarracion(String audioNarracion) {
        this.audioNarracion = audioNarracion;
    }

    
}
