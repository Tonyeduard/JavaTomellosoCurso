
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
public class EjercicioResuelto5_10 {

    public static void main(String args[]) {
        int[] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero dentro del array");
        int valor = sc.nextInt();

        if (valor > 1  || 10 < valor) {

            int arrayMayores[] = eliminarMayores(arrayNumeros, valor);

            System.out.println("SE HAN ELIMINADO LOS NUMEROS MAYORES");
            for (int i = 0; i < arrayMayores.length; i++) {
                System.out.print(arrayMayores[i] + " ");

            }
        }else{
            System.out.println("El numero no se encuentra en el array");
        }
        

    }

    public static int[] eliminarMayores(int array[], int valor) {
        int[] copiaNumeros = Arrays.copyOf(array, array.length);

        int i = 0;

        while (i < copiaNumeros.length) {
            if (copiaNumeros[i] > valor) {
                //ELIMINAR COPIA
                copiaNumeros[i] = copiaNumeros[copiaNumeros.length - 1];
                //ELIMINAMOS EL ÚLTIMO
                copiaNumeros = Arrays.copyOf(copiaNumeros, copiaNumeros.length - 1);
            } else {
                i++;
            }
        }
        return copiaNumeros;
    }
}
