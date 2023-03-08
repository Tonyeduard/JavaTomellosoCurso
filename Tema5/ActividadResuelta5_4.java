/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAVA
 */
public class ActividadResuelta5_4 {

    public static void main(String args[]) {
        int[] numeros = new int[]{5, 7, 9, 8, 4, 5, 1};

        int numMayor = maximo(numeros);
        System.out.println("El mayor es: " + numMayor);

    }
    
    public static int maximo(int t[]){
        int mayor = t[0];
        for (int x = 1; x < t.length; x++) {
            if (t[x] > mayor) {
                mayor = t[x];
            }
        }
        return mayor;
    }
}
