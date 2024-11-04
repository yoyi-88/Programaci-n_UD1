package ejercicios;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un número para ver si es par o no");
        numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        } 
    }
}
