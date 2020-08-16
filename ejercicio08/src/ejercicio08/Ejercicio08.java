/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * Desarrollar un programa que permita pedir un número entre 0 y 9.999 y pueda
 * decir cuántas cifras tiene.
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int cifra = 0;

        do {
            System.out.println("Ingrese un número entre 0 y 9.999.");
            num = entrada.nextInt();
            cifra = 0;

            if (num >= 0) {
                cifra++;
            }
            if (num >= 10) {
                cifra++;
            }
            if (num >= 100) {
                cifra++;
            }
            if (num >= 1000) {
                cifra++;
            }
            if (cifra >= 2) {
                System.out.println("tiene: " + cifra + " cifras.");
            } else {
                System.out.println("tiene: " + cifra + " cifra");
            }
            System.out.println("------------------------");
        } while (num >= 0 && num <= 9999);

        System.out.println("Ingreso un número fuera del rango.");
        System.out.println("Compile nuevamente e ingrese un número dentro del rango 0 y 9.999.");

        // TODO code application logic here
    }

}
