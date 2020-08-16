/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author J Cardoza
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int b = sc.nextInt();
        
        if (a % b == 0) {
            System.out.println("El numero: " + b + ", es multiplo de: " + a);
            
        }else{
            System.out.println("El numero: " + b + ", no es multiplo de: " +a);
        }
        
        
    }
    
}
