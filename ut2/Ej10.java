
package programacion.ut2;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double kgMan;
        double kgPer;
        double kgMan2;
        double kgPer2;
        final float pMan = 2.35f;
        final float pPer = 1.95f;
        double a;
        double b;
        double precioFinal1;
        double precioFinal2;
        double precioFinalfinal;
        
        System.out.println("Kilos de manzana vendidos este semestre");
        kgMan = sc.nextInt();
        System.out.println("Kilos de pera vendidos este semestre");
        kgPer = sc.nextInt();
        a = (kgMan * pMan);
        b = (kgPer * pPer);
        precioFinal1 = a += b;
        System.out.println("Precio final semestre 1 = " + precioFinal1 + "$");
        
        System.out.println("Kilos de manzana vendidos el segundo semestre");
        kgMan2 = sc.nextInt();
        System.out.println("Kilos de pera vendidos el segundo semestre");
        kgPer2 = sc.nextInt();
        precioFinal2 = (kgMan2 * pMan) + (kgPer2 * pPer);
        System.out.println("Precio final semestre 2 = " + precioFinal2 + "$");
        
        precioFinalfinal = precioFinal1 + precioFinal2;
        System.out.println("El dinero obtenido el año completo es: " + precioFinalfinal);
    }
}
