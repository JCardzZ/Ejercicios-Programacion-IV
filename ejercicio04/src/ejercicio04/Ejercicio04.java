/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * Desarrollar un programa que permita pedir un número e indicar si es positivo o negativo. 
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
        Scanner n = new Scanner(System.in);
        
        System.out.println("Ingresa el numero: ");
        numero = n.nextInt();
        
        if (numero<0) {
            System.out.println("El numero es negativo: "+numero);
        }else{
            System.out.println("El numero es positivo: "+numero);
        }
        
        
        
    }
    
}
