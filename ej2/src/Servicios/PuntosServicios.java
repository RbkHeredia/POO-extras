/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class PuntosServicios {
    Scanner read = new Scanner(System.in);
    
    public Puntos crearPuntos() {
        Puntos p1 = new Puntos();
        System.out.println("----Punto 1");
        System.out.println("Ingrese coord X");
        p1.setX1(read.nextInt());
        System.out.println("Ingrese coord Y");
        p1.setY1(read.nextInt());
        System.out.println("----Punto 2");
        System.out.println("Ingrese coord X");
        p1.setX2(read.nextInt());
        System.out.println("Ingrese coord Y");
        p1.setY2(read.nextInt());
        return p1;
    }
    
    public double calcular(Puntos p1){
        double total = Math.sqrt(Math.pow(p1.getX2()-p1.getX1(), 2)+Math.pow(p1.getY2()-p1.getY1(), 2));
        return total;
    }
}
