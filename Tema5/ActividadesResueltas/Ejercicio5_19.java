/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Aplicacion para gestionar la llegada a meta de los participantes de una
 * carrera.
 *
 * @author JAVA Cada uno tiene un dorsal int dorsal
 */
public class Ejercicio5_19 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numeroDorsal = 0;
        int contador = 0;
        int[] participantes = new int[0];
        System.out.println("CARRERA CONTRA EL CANCER");
        do {
            System.out.println("Introduce el dorsal que ha llegado a la meta");
            numeroDorsal = sc.nextInt();
            participantes=copyOf(participantes, numeroDorsal);
            contador++;
        } while (numeroDorsal != -1);

    }

    public static int[] copyOf(int[] participantes, int nuevoDorsal) {
        int[] participantesOrdenados = Arrays.copyOf(participantes, participantes.length + 1);
        participantes[participantes.length -1] = nuevoDorsal;
        return participantesOrdenados;

    }
}
