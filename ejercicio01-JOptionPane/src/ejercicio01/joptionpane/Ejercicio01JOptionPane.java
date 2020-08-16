/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.joptionpane;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author J Cardoza
 */
public class Ejercicio01JOptionPane {

    Scanner lector = new Scanner(System.in);

    Ejercicio01JOptionPane() {

        String rad, mensaje;
        double radioAux, area, longitud;

        rad = JOptionPane.showInputDialog("Ingresa el radio del circulo: ");
        radioAux = Double.parseDouble(rad);

        area = Math.PI * Math.pow(radioAux, 2);
        longitud = 2 * Math.PI * radioAux;

        mensaje = ("El area del circulo es: " + area + "\nLa longitud de la circunferencia es: " + longitud);
        JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }

    public static void main(String[] args) {

        Ejercicio01JOptionPane solucion = new Ejercicio01JOptionPane();

    }

}
