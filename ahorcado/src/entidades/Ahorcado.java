/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author rebek
 */
public class Ahorcado {
    private String[] palabra;
    private int cantLetrasEncontradas;
    private int vidas;

    public Ahorcado() {
    }

    public Ahorcado(int cantLetrasEncontradas, int vidas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.vidas = vidas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
}
