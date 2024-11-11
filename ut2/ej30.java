package programacion.ut2;

import java.util.Scanner;


public class ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Teclee un número");
        num = sc.nextInt();
        
        for (int i = num; i > 0; i--) {
            System.out.println("---");
            for (int j = num; j < num; j++) {
                System.out.println("*");
            }
        }
    }
    
}
