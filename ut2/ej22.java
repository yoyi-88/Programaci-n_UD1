
package programacion.ut2;

import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Este programa te dice si el número que introduzcas"
                + "es par, si es positivo, y su cuadrado. Para salir introduce"
                + "0");
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
        while (num != 0) {
            
            if ((num % 2) == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("No es par");
            }
            if (num >= 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }
            System.out.println("Su cuadrado es: " + Math.pow(num, 2));
            
            System.out.println("Introduce un número");
            num = sc.nextInt();
        }
    }
    
}
