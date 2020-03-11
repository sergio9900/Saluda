/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saluda;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Saluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.print("Introduzca su nombre: ");
        nombre = sc.nextLine();

        System.out.println("Hola " + nombre);
        
    }

}
