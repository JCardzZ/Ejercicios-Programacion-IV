/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author J Cardoza
 */
public class Ejercicio06 {

    /**
     * Desarrollar un programa que permita pedir dos números y decir cual es el
     * mayor o si son iguales.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("Son Iguales");

        } else {
            if (numero1 > numero2) {
                System.out.println(numero1 + " es mayor que " + numero2);
            } else {
                System.out.println(numero2+ " es mayor que " + numero1);
            }
        }
    }
}
