/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * Desarrollar un programa que permita pedir dos números y decir si son iguales
 * o no.
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1, numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("Son Iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }

}
