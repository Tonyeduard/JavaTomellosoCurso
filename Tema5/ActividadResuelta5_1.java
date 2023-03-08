/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Crea una tabla de longitud10 que se inicializará con números aleatorios comprendidos entre 1 y 100.
 * Mostrar la suma de todos los números aleatorios que se guardan en la tabla
 * @author JAVA
 */
public class ActividadResuelta5_1 {
    public static void main(String args[]){
        int numeros[] = new int[10];
        int resultado = 0;
        
        //GENERAMOS VALORES RANDOM
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100 + 1);
            System.out.println(i + ": numero generado: " + numeros[i]);
        }
        
        //REALIZAMOS LA SUMA 
        for (int valor: numeros) {
            resultado += valor;
        }
        
        //RESULTADO DE LA SUMA
        System.out.println("El resultado de todos los valores de la tabla es:  " + resultado);
        
    }
}
