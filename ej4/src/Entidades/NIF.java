/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author rebek
 */
public class NIF {
    private int DNI;
    private String NIF;

    public NIF() {
    }

    public NIF(int DNI, String NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    
}
