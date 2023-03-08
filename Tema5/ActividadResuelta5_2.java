/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta5_2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numeroIntro;
        int[] arrayNumeros = new int[5];
        
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Introduce un número: ");
            numeroIntro = sc.nextInt();
            arrayNumeros[i] = numeroIntro;
            
        }
        
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println(i + ": " + arrayNumeros[i]);
        }
    }
}
