
package programacion.ut2;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        
        System.out.println("¿Qué nota has sacado?");
        nota = sc.nextInt();
        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("insuficiente");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7, 8:
                System.out.println("notable");
                break;
            case 9, 10:
                System.out.println("sobresaliente");
                break;
            default:
                System.out.println("valor no válido");        
        }       
    }
}
