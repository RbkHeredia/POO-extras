/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import Entidades.Puntos;
import Servicios.PuntosServicios;

/**
 *
 * @author rebek
 * 
 *  Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como 
calcular la distancia entre dos puntos consulte el siguiente link: 
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html 

 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosServicios ps = new PuntosServicios();
        Puntos ptos = ps.crearPuntos();
        System.out.println("La distancia entre los puntos es: " + ps.calcular(ptos));
    }
    
}
