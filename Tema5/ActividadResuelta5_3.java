
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAVA
 */
public class ActividadResuelta5_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numVeces;
        int numIntroArray;
  
        
        System.out.println("Introduce un número: ");
        numVeces = sc.nextInt();
        int arrayNumeros[] = new int[numVeces];
        
        for (int i = 0; i < numVeces; i++) {
            System.out.println("Introduce el numero " + i + " para el array: ");
            numIntroArray = sc.nextInt();
            arrayNumeros[i] = numIntroArray;
        }
        
        System.out.println("");
        
        for (int i = arrayNumeros.length - 1; i >= 0; i--) {
            System.out.println(arrayNumeros[i]);
        }
        
    }
}
