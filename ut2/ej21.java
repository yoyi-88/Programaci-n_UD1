package programacion.ut2;

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.println("Elige un mes escribiendo su número correspondiente");
        mes = sc.nextInt();

        switch (mes) {
            case 1,3,5,7,8,10,12 -> System.out.println("El mes " + mes + " tiene 31 días"); 
            case 4,6,9,11 -> System.out.println("El mes " + mes + "Tiene 30 días");
            case 2 -> System.out.println("El mes " + mes + "Tiene 28 días");     
        }
    }
}
