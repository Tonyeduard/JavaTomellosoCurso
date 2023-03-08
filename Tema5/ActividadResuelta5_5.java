/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta5_5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int longitud = 0;
        int numFin = 0;
        
        System.out.println("Indique la longitud del array: ");
        longitud = sc.nextInt();
        System.out.println("Indique hasta donde irá el número: ");
        numFin = sc.nextInt();
        int numeros[] = rellenaPares(longitud, numFin);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numeros del arrary" + i + ": " + numeros[i]);
        }
       
    }

    public static int[] rellenaPares(int longitud, int fin) {
        int numPares[] = new int[longitud];
        int num1 = 0;
        int numAleatorio;

        while (num1 < numPares.length) {
            numAleatorio = (int) (Math.random() * fin + 1);
            if (numAleatorio % 2 == 0) {
                numPares[num1] = numAleatorio;
                num1++;
            }
        }
        Arrays.sort(numPares);
        return numPares;
    }

}
