
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;
        boolean anagrama = false;

        System.out.println("Escribe una palabra: ");
        palabra1 = sc.nextLine();
        System.out.println("Escribe la otra palabra: ");
        palabra2 = sc.nextLine();

        if (palabra1.length() != palabra2.length()) {
            System.out.println("No son anagrama");
        } else {
            //GUARDAMOS EN UNA TABLA
            char palabra1Tabla[] = palabra1.toCharArray();
            char palabra2Tabla[] = palabra2.toCharArray();
            Arrays.sort(palabra1Tabla);
            Arrays.sort(palabra2Tabla);
            if (Arrays.equals(palabra1Tabla, palabra2Tabla)) {
                System.out.println("Son anagramas");
            }else{
                System.out.println("No son anagramas");
            }
        }
    }
}
