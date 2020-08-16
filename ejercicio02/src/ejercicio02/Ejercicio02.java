/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * Desarrollar un programa solicite el radio de una circunferencia y pueda calcular su longitud. 
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        double radio,l;
        
        System.out.println("Ingresa el radio de la circunferencia: ");
        radio=entrada.nextDouble();
        
        l=2*Math.PI*radio;
        
        System.out.println("La longitud de la circunferencia de radio es "+ radio + " es: "+l);
    }
    
}
