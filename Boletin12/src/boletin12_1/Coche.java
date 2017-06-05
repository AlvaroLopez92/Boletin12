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
public class Coche extends Garaje {

    private String matricula;

    public Coche() {
        numeroCoches++;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String pedirMatricula() {
        return JOptionPane.showInputDialog("Introduce la matrícula");
    }

}