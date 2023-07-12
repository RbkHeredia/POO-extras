/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class NIFServicios {
    public NIF crearNIF(){
        NIF n1 = new NIF();
        Scanner read = new Scanner(System.in);
        int dni;
        int i;
        String[] letters = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.println("Ingrese su dni");
        dni= read.nextInt();
        n1.setDNI(dni);
        i =  dni%23;
        n1.setNIF(letters[i]);
        return n1;
    }
    public void mostrar(NIF n1){
        System.out.println("NIF: "+ n1.getDNI()+"-"+n1.getNIF());
    }
}
