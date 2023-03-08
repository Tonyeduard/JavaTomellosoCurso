

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_8 {

    public static void main(String args[]) {
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        String valido;
        boolean esJavilander = false;
        String fraseIntroducidaUser;
        String fraseJavilandia = "hola";
        String fraseFinJavilandia = "adios";

        //SALIDA DE PANTALLA
        System.out.println("Usted cree que es de Javilandia?");
        valido = sc.nextLine();
        System.out.println("**************");
        System.out.println("Comprobaremos si es cierto . . . \n Primer paso escriba una frase: ");
        fraseIntroducidaUser = sc.nextLine();

        //COMPROBACIÓN SI LA FRASE EMPIEZA POR "Javilín, javalón"
        if (fraseIntroducidaUser.startsWith(fraseJavilandia) == true && fraseIntroducidaUser.endsWith(fraseFinJavilandia) == true) {
            esJavilander = true;
            //fraseIntroducidaUser = fraseIntroducidaUser.substring(fraseJavilandia.length());

        } else if (esJavilander) {
            fraseIntroducidaUser = fraseIntroducidaUser.replace(fraseJavilandia, "");
            fraseIntroducidaUser = fraseIntroducidaUser.replace(fraseFinJavilandia, "");

            System.out.println(fraseIntroducidaUser);
            System.out.println(" USTED ES JAVALINDER");

        } else {
            System.out.println("NO ERES JAVILANDER");
        }

    }
}
