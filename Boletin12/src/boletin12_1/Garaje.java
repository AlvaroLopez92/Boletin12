
package boletin12_1;

import java.util.Scanner;

public class Garaje {

    public static int numeroCoches;

    public Garaje() {
    }

    public Garaje(int numeroCoches) {
        this.numeroCoches = numeroCoches;

    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }
}