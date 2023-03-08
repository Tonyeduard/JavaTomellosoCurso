
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JAVA
 */
public class ActividadResuelta5_7 {

    public static void main(String[] args) {
        int tabla[] = {1, 5, 9, 2, 4, 4, 4, 5, 5};
        System.out.println("Con valores repetidos: " + Arrays.toString(tabla));
        int[] sinRepetidos = sinRepetidos(tabla);
        System.out.println("Los valores sin repetidos son: " + Arrays.toString(sinRepetidos));
    }

    static int[] sinRepetidos(int[] t) {
        int temporal[] = new int[0];
        for (int elemento : t) {
            if (buscar(temporal, elemento) == -1) {
                temporal = Arrays.copyOf(temporal, temporal.length + 1);
                temporal[temporal.length - 1] = elemento;
            }
        }
        return temporal;
    }

    static int buscar(int t[], int clave) {
        int posicion;
        int i = 0;

        while (i < t.length && t[i] != clave) {
            i++;
        }
        if (i < t.length) {
            posicion = i;

        } else {
            posicion = -1;
        }
        return posicion;

    }
}
