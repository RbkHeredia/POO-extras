/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author rebek
 * 
 * https://lineadecodigo.com/java/convertir-una-cadena-en-un-array-de-caracteres-con-java/
 */
public class AhorcadoServicios {
    Scanner read = new Scanner(System.in);
    public Ahorcado crearJuego() {
        Ahorcado a1 = new Ahorcado();
        System.out.println("Ingrese la palabra");
        String palabra = read.nextLine();
        System.out.println("Ingrese la cantidad de vidas");
        a1.setVidas(read.nextInt());
        a1.setCantLetras(palabra.length());
        char[] array = palabra.toCharArray();
        a1.setPalabra(array);
        return a1;
    }
    
    public void info(Ahorcado a1){
        System.out.println("--------------------------------------");
        System.out.println("La palabra tiene: "+ a1.getCantLetras() + " letras");
        System.out.println("Encontró: " + a1.getLetrasEncontradas()+ " letras");
        System.out.println("Faltan: " + (a1.getCantLetras()-a1.getLetrasEncontradas()) + " letras");
        System.out.println("Le quedan: "+ a1.getVidas()+ " intentos");
        System.out.println("--------------------------------------");
    }
    
    public void juego(Ahorcado a1){
        char letra;
        int encontradas=0;
        char[] aux = new char[a1.getCantLetras()];
        aux = iniciarAux(aux, a1.getCantLetras());
        boolean gameOver = false;
        do{
            info(a1);
            System.out.println("Ingrese una letra");
            letra = read.next().charAt(0);
            for (int i = 0; i < a1.getCantLetras(); i++) {
                if(Character.compare(a1.getPalabra()[i], letra) == 0){
                    encontradas ++;
                    aux[i] = letra;
                }
            }
            if(encontradas == 0){
                a1.setVidas(restarVidas(a1.getVidas()));
                System.out.println("No hay coincidencias");
            }
            
            System.out.println("Progreso:");
            mostrarPal(aux);
            a1.setLetrasEncontradas(a1.getLetrasEncontradas()+encontradas);
            if(a1.getLetrasEncontradas()== a1.getCantLetras()){
                gameOver = true;
            }
            encontradas = 0;
        }while(a1.getVidas()>0 && !gameOver);
        if (gameOver){
            System.out.println("Adivinaste la palabra!!!!");
        } else {
            System.out.println("Te quedaste sin vidas =(");
        }
    }
    
    public char[] iniciarAux(char[] arrays, int cant){
        for (int i = 0; i < cant; i++) {
            arrays[i] = '_';
        }
        return arrays;
    }
    
    public int restarVidas(int vidas){
        System.out.println(vidas--);
        return vidas--;
    }
    
    public void mostrarPal(char[] palabra){
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i]+ " ");
        }
        System.out.println("");
    }
}
