package ejercicios;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Introduzca numero1");
        numero1 = sc.nextInt();
        System.out.println("Introduzca numero2");
        numero2 = sc.nextInt();
        
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");
            
            if (numero1 < numero2) {
                System.out.println(numero1 + " es menor que " + numero2);
            } else {
                System.out.println(numero1 + " es mayor que " + numero2);
            } 
        } 
        
    }
}
