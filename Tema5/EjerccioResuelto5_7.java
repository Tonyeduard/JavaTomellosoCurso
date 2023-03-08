
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JAVA
 */
public class EjerccioResuelto5_7 {

    public static void main(String args[]) {
        int[] arrayNumerosDesordenados = {5, 8, 4, 6};
        int[] arrayOrdenada = sinRepetidos(arrayNumerosDesordenados);

    
        for (int i = 0; i < arrayOrdenada.length; i++) {
            System.out.println("LISTA ORDENADA: " + arrayOrdenada[i]);
        }
    }

    public static int[] sinRepetidos(int arrayIntro[]) {
        int[] temporal = new int[arrayIntro.length];
        Arrays.sort(arrayIntro);
        
        for (int i : temporal) {
            if (buscar(temporal, i) == -1) {
                temporal = Arrays.copyOf(temporal, temporal.length + 1);
                temporal[temporal.length - 1] = i;
            }
        }
        
        return temporal;
    }

    public static int buscar(int temporal[], int i) {
        int resultado = 0;

        //GENERAMOS VALORES RANDOM
        for (int j = 0; j < temporal.length; j++) {
            temporal[j] = (int) (Math.random() * 100 + 1);
            System.out.println(j + ": numero generado: " + temporal[j]);
        }

        //REALIZAMOS LA SUMA 
        for (int valor : temporal) {
            resultado += valor;
        }

        //RESULTADO DE LA SUMA
        System.out.println("El resultado de todos los valores de la tabla es:  " + resultado);
        
        return resultado;
    }
}
