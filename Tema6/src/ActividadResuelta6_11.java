
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_11 {

    public static void main(String args[]) {
        char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        Scanner sc = new Scanner(System.in); 
        char codificado[];
        String texto;
        
        System.out.println("INTRODUZCA UN TEXTO: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();
        
        //SE CREA UNA TABBLA EN BASE A LA FRASE
        codificado = new char[texto.length()];
        
        //LLAMAMOS A LA FUNCION CODIFICAR HASTA SU FINAL DE LA FRASE
        for (int i = 0; i < texto.length(); i++) {
            codificado[i] = codificar(conjunto1, conjunto2, texto.charAt(i));
        }
        texto = String.valueOf(codificado);
        System.out.println(texto);
    
    }
    
    public static char codificar(char conjunto1[], char conjunto2[], char c){
        final String conjunto = String.valueOf(conjunto1);
        char codificado;
        int posicion = conjunto.indexOf(c);
        if(posicion == -1){
            codificado = c;
        }else{
            codificado = conjunto2[posicion];
        }
        return codificado;
    }
}
