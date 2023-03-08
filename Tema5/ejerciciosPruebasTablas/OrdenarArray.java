/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPruebasTablas;

import java.util.Arrays;

/**
 *
 * @author JAVA
 */
public class OrdenarArray {
    public static void main(String args[]){
        int[] numerosDesordenada = { 5 ,8, 9, 2, 1,0, 4};
        
        System.out.println("ARRAY DESORDENADA");
        System.out.println("------------------------");
        for (int i = 0; i < numerosDesordenada.length; i++) {
            System.out.print(numerosDesordenada[i] + " ");
        }
        System.out.println("\n------------------------");
        Arrays.sort(numerosDesordenada);
        System.out.println("");
        System.out.println("ARRAY ORDENADA");
        System.out.println("------------------------");
        for (int i = 0; i < numerosDesordenada.length; i++) {
            System.out.print(numerosDesordenada[i]  + " ");
        }
        

    }
    
    
}
