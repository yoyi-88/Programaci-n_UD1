package programacion.ut2;

import java.util.Scanner;

public class Ej7 {
    public static void main (String[] args)  {
        Scanner sc=new Scanner (System.in);
        int edad;
        System.out.println("¿Introduzca su edad para saber si es mayor de "
                + "edad?");
        edad = sc.nextInt();
        System.out.println("Edad " + (edad > 18));
    }
}
