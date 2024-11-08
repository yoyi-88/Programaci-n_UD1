package programacion.ut2;

import java.util.Scanner;

public class ej20expresion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("¿Qué nota has sacado?");
        nota = sc.nextInt();
        switch (nota) {
            case 0,1,2,3,4 -> System.out.println("insuficiente"); 
            case 5 -> System.out.println("suficiente");
            case 6 -> System.out.println("bien");
            case 7, 8 -> System.out.println("notable");
            case 9, 10 -> System.out.println("sobresaliente");
            default -> System.out.println("valor no válido");        
        }
    }
}
