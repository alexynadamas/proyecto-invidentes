/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Representa una ubicación y sus atributos
 *
 * @author Alex Clemente < DAW >
 */
public class Ubicacion {

    private String calle;
    private String patio;
    private String puerta;
    private int codigoPostal;
    private String municipio;
    private String provincia;

    /**
     * Constructor con todos las propiedades
     *
     * @param calle
     * @param patio
     * @param puerta
     * @param codigoPostal
     * @param municipio
     * @param provincia
     */
    public Ubicacion(String calle, String patio, String puerta, int codigoPostal, String municipio, String provincia) {
        this.calle = calle;
        this.patio = patio;
        this.puerta = puerta;
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}