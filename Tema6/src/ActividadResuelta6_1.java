/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAVA
 */
public class ActividadResuelta6_1 {
    public static void main(String args[]){
        for (int i = 0x000; i <= 0xFFFF; i++) {
            String xxxx = Integer.toHexString(i);
            System.out.println("\\u" + xxxx + ": " + (char)i);
        }
    }
}
