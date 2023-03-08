
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String frase;
        int veces = 0;
        int posicion;
        String palabra;
        System.out.println("Indique la frase: ");
        frase = sc.nextLine();
        System.out.println("Indique la palabra: ");
        palabra = sc.next();
        posicion = frase.indexOf(palabra);
        do {
            veces++;
            posicion = frase.indexOf(palabra, posicion +1);
            
        } while (posicion != -1);
       
        if (veces == 0) {
            System.out.println("No se ha encontrado la palabra en la frase");
            
        }else{
            System.out.println("La palabra : " + palabra + " aparece en la frase " + veces + " veces");
        }
        
        
    }
}
