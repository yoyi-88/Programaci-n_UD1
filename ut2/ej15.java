
package ejercicios;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroDecimal;
        long numeroRedondeado;
        
        System.out.print("Introduce un número decimal: ");
        numeroDecimal = sc.nextDouble();
        
        numeroRedondeado = Math.round(numeroDecimal);
        
        System.out.println("Número redondeado: " + numeroRedondeado);
    }
}
