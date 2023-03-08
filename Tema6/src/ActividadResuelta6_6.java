
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String nombre;
        char a;
        String resultado = "";
        System.out.println("Introduce su nombre completo: ");
        nombre = sc.nextLine();
        for (int i = 0; i < nombre.length(); i++) {
            a = nombre.charAt(i);
            if (!esVocal(a)) {
                resultado = resultado + a;
            }
        }
        
        System.out.println(resultado);
    }

    public static boolean esVocal(char a) {
        boolean vocal = false;
        String vocales = "aeiouáéíóú";
        char aMin = Character.toLowerCase(a);
        if(vocales.indexOf(aMin) == -1 ){
            vocal = true;
        }
        
        return vocal;
    }
}
