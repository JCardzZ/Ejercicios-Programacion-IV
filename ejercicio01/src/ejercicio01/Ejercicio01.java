/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * Desarrollar un programa que permita pedir el radio de un círculo y que pueda calcular su área. A=PI*r^2.
 */
public class Ejercicio01 {

    Scanner lector = new Scanner(System.in);

    public Ejercicio01() {

        double radio, area, longitud;

        System.out.println("Ingresa el radio del circulo: ");
        radio = lector.nextDouble();

        area = Math.PI * Math.pow(radio, 2);
        longitud=2*Math.PI*radio;
        
        System.out.println("El area del circulo es: "+area);
        System.out.println("La longitud de la circunferencia de la circunferencia es: "+ longitud);

    }

    public static void main(String[] args) {

        Ejercicio01 solucion = new Ejercicio01();
    }

}
