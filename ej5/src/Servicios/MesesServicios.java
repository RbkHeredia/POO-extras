/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class MesesServicios {
    public Meses comenzarJuego(){
        Scanner read = new Scanner(System.in);
        Meses m1 = new Meses();
        String secret = m1.getMesSecreto();
        int counter = 0;
        System.out.println("Tienes 3 intentos para adivinar el mes.");
        System.out.println("Ingrese un mes");
        String mes = read.nextLine();
        while(!mes.equals(secret) && counter<2){
            System.out.println("No es el mes, ingrese otra opcion");
            mes = read.nextLine();
            counter ++;
        }
        
        if(counter<2){
            System.out.println("Adivinaste! El mes es: "+ secret);
        } else {
            System.out.println("Perdiste! El mes es: "+ secret);
        }
        
        System.out.println("Juego finalizado");
        return m1;
    }
}
