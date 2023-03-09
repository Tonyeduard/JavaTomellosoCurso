
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_15 {

    public static void main(String args[]) {
        String frase;
        String adivina;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("JUEGADOR 1. \n Introduzca una palabra: ");
            frase = sc.next();
        } while (frase.isEmpty());

        String anagrama = crearAnagrama(frase);
        System.out.println("A qué palabra correspondo el anagrama: " + anagrama);

        do {
            System.out.println("JUGADOR 2. \n ¿Cual es el original?");
            adivina = sc.next();
            System.out.println("Las letras correctas: " + letrasCorrectas(frase, adivina));
        } while (!frase.equals(adivina));
    }

    public static String crearAnagrama(String frase) {
        char anagrama[] = frase.toCharArray();
        for (int numCambios = 0; numCambios < anagrama.length; numCambios++) {
            int i = (int) (Math.random() * anagrama.length);
            int j = (int) (Math.random() * anagrama.length);
            char aux = anagrama[i];
            anagrama[i] = anagrama[j];
            anagrama[j] = aux;
        }
        return String.valueOf(anagrama);

    }

    public static int letrasCorrectas(String frase, String adivina) {
        int contador = 0;
        int longMinima = Math.min(frase.length(), adivina.length());
        for (int i = 0; i < longMinima; i++) {
            if (frase.charAt(i) == adivina.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }
}
