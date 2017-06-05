/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class Metodos {

    public double precio(float Horas) {
        double horasExtra = 0;
        if (Horas > 3) 
            horasExtra = Horas - 3;
        return (1.5 + horasExtra * 0.20);
    }

    public double devolucion(double coste, double pago) {
        return (pago-coste);
    }

    public void factura(float Horas, double coste, double pago, double devolucion, String matricula) {
        System.out.println("FACTURA: \n Matricula coche: " + matricula + "\n Tiempo: " + Horas + " h" + "\n Precio: " + coste + " €" + "\n Dinero recibido: " + pago + " €" + " \n Dinero devuelto: " + devolucion + " €");
    }

    public float pedirDato() {
        return Float.parseFloat(JOptionPane.showInputDialog("Tiempo y dinero?"));
    }
}