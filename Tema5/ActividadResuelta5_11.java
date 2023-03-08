
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
public class ActividadResuelta5_11 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int longitud = 0;
        int numIntro = 0;
        boolean opcion = false;

        System.out.println("BIENVENIDO AL JUEGO DE LA CAMARA SECRETA");
        System.out.println("1. JUGAR");
        System.out.println("2. SALIR");
        numIntro = sc.nextInt();
        if (numIntro == 1) {
            System.out.println("Introduce la longitud de la combinacion de numeros: ");
            longitud = sc.nextInt();

            int[] combinacionSecreta = new int[longitud];

            combinacionSecreta = crearNumerosAleatoriosSecretos(combinacionSecreta);

            System.out.println(Arrays.toString(combinacionSecreta));
            int[] combinacionUsuario = new int[longitud];

            introducirNumerosUsuario(combinacionSecreta);
            
        }
    }

    public static int[] crearNumerosAleatoriosSecretos(int[] combinacionSecreta) {
        int[] numerosAleaSecret = combinacionSecreta;

        for (int i = 0; i < numerosAleaSecret.length; i++) {
            numerosAleaSecret[i] = (int) (Math.random() * 5 + 1);
        }

        return numerosAleaSecret;
    }

    public static boolean introducirNumerosUsuario(int[] combinacionSecret) {
        Scanner sc = new Scanner(System.in);
        boolean combinacion = false;
        int numero = 0;
        int intentos = 3;
        int[] codigoIntroUser = new int[combinacionSecret.length];
        do {
            System.out.println("Tienes " + intentos +" intentos");
            System.out.println("Introduce una combinacion: ");
            for (int j = 0; j < combinacionSecret.length; j++) {
                System.out.println("Introduce el " + j + ": ");
                numero = sc.nextInt();
                codigoIntroUser[j] = numero;
            }

            if (combinacionSecret == codigoIntroUser) {
                System.out.println("FELICIDADES ACCEDISTE AL SISTEMA");
            } else {
                System.out.println("LLAMANDO A LA POLICIA.. NO ACCEDISTE.");
                intentos--;
            }
        } while (intentos==0);

        return combinacion;
    }
}
