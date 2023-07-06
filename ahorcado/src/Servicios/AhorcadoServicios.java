/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ahorcado.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class AhorcadoServicios {
    public Ahorcado crearJuego() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa la palabra a adivinar");
        String palabra = read.nextLine();
        System.out.println("Ingresa el numero de intentos que puedes tener");
        int intentos = read.nextInt();
        read.nextLine();
        int cantLetras = palabra.length();
        String[] ar = new String[cantLetras];
        
       
    }
}
