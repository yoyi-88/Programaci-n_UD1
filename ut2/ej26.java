
package programacion.ut2;

import java.util.Scanner;

public class ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces;
        System.out.println("Teclee un número");
        veces = sc.nextInt();
        
        for (int i = 0; i < veces; i++) {
            System.out.println("Eco");
        }
    }
}
