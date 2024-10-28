
package programacion.ut2;

import java.util.Scanner;
        
public class Ej5notamedia {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float media;
        System.out.println("Este programa calcula la nota media de dos notas");
        System.out.println("Introduzca nota 1");
        Scanner sc = new Scanner (System.in);
        nota1 = sc.nextFloat();
        System.out.println("Introduzca nota 2");
        nota2 = sc.nextFloat();
        media = (nota1 + nota2) / 2f;
        System.out.println("La nota media es: " + media);
    }
}
