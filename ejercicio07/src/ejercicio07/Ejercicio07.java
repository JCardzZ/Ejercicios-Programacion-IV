/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

import javax.swing.JOptionPane;

/**
 *
 * Desarrollar un programa que permita pedir tres números y pueda mostrarlos
 * ordenados de mayor a menor.
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, numero3;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo numero: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el tercero numero: "));

        if ((numero1 > numero2) && (numero2 > numero3)) {
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor:  " + numero1 + " - " + numero2 + " - " + numero3);
        } else if ((numero1 > numero3) && (numero3 > numero2)) {
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor: " + numero1 + " - " + numero3 + " - " + numero2);

        } else if ((numero2 > numero1) && (numero1 > numero3)) {
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor: " + numero2 + " - " + numero1 + " - " + numero3);

        } else if ((numero2 > numero3) && (numero3 > numero1)) {
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor: " + numero2 + " - " + numero3 + " - " + numero1);

        } else if ((numero3 > numero1) && (numero1 > numero2)) {
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor: " + numero3 + " - " + numero1 + " - " + numero2);

        } else {
            JOptionPane.showMessageDialog(null, "Orden de mayor a menor: " + numero3 + " - " + numero2 + " - " + numero1);

        }

    }

}
