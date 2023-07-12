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
public class Ahorcado {
    private char[] palabra;
    private int cantLetras;
    private int letrasEncontradas = 0;
    private int vidas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantLetras, int letrasEncontradas, int vidas) {
        this.palabra = palabra;
        this.cantLetras = cantLetras;
        this.letrasEncontradas = letrasEncontradas;
        this.vidas = vidas;
    }

    

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }
    
    
    
}
