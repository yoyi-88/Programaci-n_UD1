package programacion.ut2;

import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        int max = edad;
        int min = edad;
        System.out.println("En este programa ingresarás las edades que quieras"
                + "y recibirás cuales han sido la mayor y la menor");
        System.out.println("Introduce las edades, para parar introduce -1");
        
        while (edad != -1) {
            if (max<edad) {
                max = edad;
            }
            if (min>edad) {
                min = edad;
            }
            System.out.println("Dime otro número");
            edad = sc.nextInt();
        }
        System.out.println("min = " + min + " max = " + max);
    } 
}