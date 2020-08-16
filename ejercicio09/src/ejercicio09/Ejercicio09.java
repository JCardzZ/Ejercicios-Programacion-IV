/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author J Cardoza
 */
public class Ejercicio09 {

    /**
     * Desarrollar un programa que solicite una palabra y pueda determinar si se
     * escribe igual al revés.
     * Ejemplos:
     * LA RUTA NOS APORTO OTRO PASO NATURAL
     * ANA
     */
    public static void main(String[] args) {

        java.util.Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa una palabra");
        String frase = entrada.nextLine();

        if (esPalindroma(frase)) {
            System.out.println("La frase si se escribe igual al revés");
        } else {
            System.out.println("La frase no se escribe igual al revés");

        }

    }

    public static boolean esPalindroma(String frase) {
        String auxiliar = "";
        int n = frase.length();
        for (int i = 0; i < n; i++) {
            if (!(frase.substring(i, i + 1).equals(" ") 
                    || frase.substring(i, i + 1).equals(",")
                    || frase.substring(i, i + 1).equals("¿")
                    || frase.substring(i, i + 1).equals("?")
                    || frase.substring(i, i + 1).equals(".")
                    || frase.substring(i, i + 1).equals("¡")
                    || frase.substring(i, i + 1).equals("!"))) {
                auxiliar += frase.substring(i, i + 1);
            }
        }
        n = auxiliar.length();
        for (int i = 0; i < n / 2; i++) {
            if (!auxiliar.substring(i, i + 1).equals(auxiliar.substring(n - i - 1, n - i))) {
                return false;
            }

        }
        return true;

    }

}
