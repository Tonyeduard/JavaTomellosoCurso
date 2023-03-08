/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPruebasTablas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class meterNumerosEnArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arrayNumeros = new int[5];
        int numeroIntroducido;
        
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Introduce el numero de la posicion: " + i + ": ");
            numeroIntroducido = sc.nextInt();
            arrayNumeros[i] = numeroIntroducido;
        }
        
        System.out.println("1º FORMA");
        System.out.println(Arrays.toString(arrayNumeros));
        
        System.out.println("2º FORMA");
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i] + " ");
        }
        
    }
    
}
