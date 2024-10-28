
package programacion.ut2;

import java.util.Scanner;
        
public class EdadUsuario {
    public static void main(String[] args) {
        int edad;
        int edad1;
        int edad2;
        System.out.println("Introduzca su edad");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
        //También podría hacerse mediante un incremento (++)
        edad1 = edad + 1;
        System.out.println("El año que viene tendrás " + edad1 + " años");
        edad2 = edad + 10;
        System.out.println("Dentro de 10 años10 tendrás " + edad2 + " años");
    }
}
