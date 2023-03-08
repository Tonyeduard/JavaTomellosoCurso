
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String frase1, frase2;
        
        System.out.println("Introduce la primera frase: ");
        frase1 = sc.nextLine();
        System.out.println("Introduce la segunda frase: ");
        frase2 = sc.nextLine();
        System.out.println(frase1);
        System.out.println(frase2);
        
        int longitudFrase1 = frase1.length();
        int longitudFrase2 = frase2.length();
        if (longitudFrase1 < longitudFrase2) {
            System.out.println("La frase 1 es mas corta que la frase 2");
        }else if(longitudFrase1 > longitudFrase2){
            System.out.println("La frase 1 es mas larga que la frase 2");
        }else{
            System.out.println("Las 2 frases tienen la misma longitud");
        }
            
    }
    
}
