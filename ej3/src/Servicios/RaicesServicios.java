/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class RaicesServicios {
    public Raices nuevosValores(){
        Scanner read = new Scanner(System.in);
        Raices r1 = new Raices();
        System.out.println("Ingrese el primer valor:");
        r1.setA(read.nextInt());
        System.out.println("Ingrese el segundo valor:");
        r1.setB(read.nextInt());
        System.out.println("Ingrese el tercer valor:");
        r1.setC(read.nextInt());
        return r1;
    }
    public double getDiscriminante(Raices r1){
        double total;
        total = Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC();
        return total;
    }
    
    public boolean tieneRaices (Raices r1){
        boolean result = false;
        if(getDiscriminante(r1)>=0){
            result = true;
        } 
        return result;
    }
    
    public boolean tieneRaiz (Raices r1){
        boolean result = false;
        if(getDiscriminante(r1)==0){
            result = true;
        }   
        return result;
    }
    
    public void obtenerRaices(Raices r1){
        double total;
        if(tieneRaices(r1)){
            total = -r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()))/2*r1.getA() ) ;
            System.out.println("Raiz 1: "+ total);
            total = -r1.getB()-Math.sqrt((Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()))/2*r1.getA() ) ;
            System.out.println("Raiz 1: "+ total);
        } else {
            System.out.println("No tiene raices");
        }
    }
    
    public void obtenerRaiz(Raices r1){
        double total;
        if(tieneRaiz(r1)){
            total = -r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()))/2*r1.getA() ) ;
            System.out.println("Raiz 1: "+ total);
        } else {
            System.out.println("No tiene raiz");
        }
    }
    
    public void calcular(Raices r1){
        obtenerRaices(r1);
        obtenerRaiz(r1);
    }
}
