
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
public class ActividadResuelta5_6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] apuesta = {1, 5, 8, 4, 5, 8};
        int[] combinacionGanadora = {1, 5, 4, 4, 5, 8};
        int numIntro = 0;
        
        int numeroLimiteApuestaCreada = 0;
        int opcion;

        System.out.println("1. APUESTA CREADA AUTOMÁTICAMENTE");
       /* System.out.println("2. APUESTA CREADA MANUALMENTE");
        System.out.println("Indique su opcion: ");
        opcion = sc.nextInt();*/

        /*if (opcion == 1) {
            
            int resultadoAciertos = primitiva(apuesta, combinacionGanadora);
            System.out.println("El resultado de numero de aciertos son: " + resultadoAciertos);
            
        } else if (opcion == 2) {
            
            System.out.println("Indique el limite de la Apuesta ManualMente: ");
            numeroLimiteApuestaCreada = sc.nextInt();
            int[] apuestaCreada = new int[numeroLimiteApuestaCreada];
            
            for (int i = 0; i <= apuestaCreada.length; i++) {
                System.out.println("Introduce un numero para la apuesta: ");
                apuestaCreada[i] = numIntro = sc.nextInt();
            }

            System.out.println("---------------------------------");
            for (int i = 0; i < apuestaCreada.length; i++) {
                System.out.print(apuestaCreada[i] + " | ");
            }
            System.out.println("---------------------------------");
            for (int i = 0; i < combinacionGanadora.length; i++) {
                System.out.print(combinacionGanadora[i] + " | ");
            }
            int resultadoAciertosCreada = primitiva(apuestaCreada, combinacionGanadora);
            System.out.println("El resultado de numero de aciertos son: " + resultadoAciertosCreada);
        }*/

        int resultadoAciertos = primitiva(apuesta, combinacionGanadora);
        System.out.println("El resultado de numero de aciertos son: " + resultadoAciertos);

    }

    public static int primitiva(int[] apuesta, int[] combinacionGanadora) {
        int aciertos = 0;
        for (int i = 1; i < apuesta.length; i++) {
            Arrays.sort(apuesta);
            if (Arrays.binarySearch(combinacionGanadora, i) >= 0) {
                aciertos++;
            }
        }
        return aciertos;
    }
    
    
}
