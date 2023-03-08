
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Acierta la contraseña
 *
 * @author JAVA
 */
public class ActividadResuelta6_3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String contraseñaUser1;
        String pruebaUser2;
        int numIntentos = 3;
        String jugarC;
        String passwordRevision;
        boolean jugar = false;

        System.out.println("************* A*C*I*E*R*T*A * L*A *P*A*S*S*W*O*R*D* *************");
        System.out.println("REGLAS: \n 1- El jugador indica la contraseña \n 2- El jugador intenta adivinar la contraseña \n 3- El jugador 2 3 intentos \n 4- Al tercer intento se llama a la policia");
        System.out.println(" 5- Si adivinas la contraseña, ganas un punto. \n 6- Debes alcanzar 3 puntos");
        System.out.println("------------------------------------------------------------------");

        do {
            numIntentos = 3;
            System.out.println("Quieres jugar? Si o No");
            jugarC = sc.nextLine();
            if (jugarC.toUpperCase().contentEquals("SI")) {
                System.out.println("Jugador 1. Introduzca una password: ");
                contraseñaUser1 = sc.nextLine();
                do {
                    System.out.println("Repite la password para confirmar el guardado ");
                    passwordRevision = sc.nextLine();
                } while (!passwordRevision.contentEquals(contraseñaUser1));

                System.out.println("Password guardado");
                System.out.println("*************************************************");
                do {
                    System.out.println("Turno del jugador 2");
                    System.out.println("Introduce la password: ");
                    pruebaUser2 = sc.nextLine();
                    int longitudpass1 = contraseñaUser1.length();
                    int longitudpass2 = pruebaUser2.length();
                    
                    if (!pruebaUser2.contentEquals(contraseñaUser1)) {
                        System.out.println("*** ERROR ***");
                        numIntentos--;
                        System.out.println("**********************");
                        System.out.println("TE DAREMOS UNA PISTA: ");
                        if (longitudpass1 > longitudpass2) {
                            int resultado = longitudpass1 - longitudpass2;
                            System.out.println("**********---------------");
                            System.out.println("Tiene " + resultado + " carecteres mas");
                        }else{
                            int resultado = longitudpass2 - longitudpass1;
                            System.out.println("***********------------");
                            System.out.println("La password tiene " + resultado + " caracteres menos");
                            System.out.println("************------------");
                        }
                        System.out.println("----------------------------------------------");
                        System.out.println("Usted dispone de " + numIntentos + " intentos.");
                        System.out.println("----------------------------------------------");
                    } else {
                        System.out.println("ENHORABUENA ACCEDISTE AL SISTEMA");
                    }
                } while (numIntentos > 0);
                if (numIntentos == 0) {
                    System.out.println("LLAMANDO A LA POLICIA NO LOGRASTE ACCEDER AL SISTEMA");
                } else {
                    System.out.println("El password que ingresaste fue: " + contraseñaUser1);
                }
                jugar = true;
            } else {
                jugar = false;
            }
        } while (jugar);
        System.out.println("bien jugado!! HASTA LA PROXIMA");

    }
}
