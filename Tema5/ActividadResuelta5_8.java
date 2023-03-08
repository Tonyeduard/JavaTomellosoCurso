
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
public class ActividadResuelta5_8 {
    public static void main(String args[]){
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        int tablaPar[] = new int[0];
        int tablaImPar[] = new int[0];
        int numLeidos = 0;
        int longitudTabla;
        int numIntroTabla = 0;
        
        System.out.println("Escriba un número: ");
        numLeidos = sc.nextInt();
        System.out.println("Escriba una longitud de la tabla: ");
        longitudTabla = sc.nextInt();
        int[] tablaDatos = new int[longitudTabla];
        
        System.out.println("INTRODUCIMOS NUMEROS EN LA TABLA --------------------");
        for (int i = 0; i < tablaDatos.length; i++) {
            System.out.println("Introduce un numero: ");
            numIntroTabla = sc.nextInt();
            tablaDatos[i] = numIntroTabla;
        }
        
        tablaParImparFuncion(tablaDatos);
    }
    
    public static void tablaParImparFuncion(int datosPares[]){
        int[] tablaPar = datosPares;
        int[] tablaImpar = datosPares;
        for (int i = 0; i <= tablaPar.length; i++) {
            if (i % 2 == 0 ) {
                tablaPar = Arrays.copyOf(tablaPar, tablaPar.length + 1);
                tablaPar[tablaPar.length-1] =  i;
            }else{
            tablaImpar = Arrays.copyOf(tablaImpar, tablaImpar.length+1);
            tablaImpar[tablaImpar.length - 1] = i;
        }
        }
        
        System.out.println("TABLA PARES: " + Arrays.toString(tablaPar));
        System.out.println("TABLA IMPARES: " + Arrays.toString(tablaImpar));
    }
}
