
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numeroEspacios = 0;
        String fraseIntro;
        System.out.println("Introduce una frase: ");
        fraseIntro = sc.nextLine();
        
        for (int i = 0; i < fraseIntro.length(); i++) {
            if (fraseIntro.charAt(i) == ' '){
                numeroEspacios++;
            }
        }
        
        System.out.println("La frase esta compuesta por " + numeroEspacios + " espacios.");
    }
}
