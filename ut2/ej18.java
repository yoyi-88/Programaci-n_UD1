package ejercicios;

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.print("Introduce un número decimal: ");
        numero = sc.nextDouble();

        if (numero < 1 && numero != 0) {
            System.out.println("El número " + numero + " es casi-cero.");
        } else {
            System.out.println("El número " + numero + " no es casi-cero.");
        }
    }
}
