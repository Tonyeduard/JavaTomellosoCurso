
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Introduce un frase: ");
        frase = sc.nextLine();
        vueltaInvertida(frase);
    }

    public static void vueltaInvertida(String frase) {
        String fraseNueva = "";
        for (int i = 0; i < frase.length(); i++) {
            fraseNueva = frase.charAt(i) + fraseNueva;
        }
        System.out.println("La nueva frase es: " + fraseNueva);
    }
}
