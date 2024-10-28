package programacion.ut2;

import java.util.Scanner;

public class EdadMedianteFecha {
    public static void main(String[] args) {
        int anyo;
        int fecha;
        int resta;
        System.out.println("Escriba el año actual");
        Scanner sc = new Scanner (System.in);
        fecha = sc.nextInt();
        System.out.println("Escriba su año de nacimiento");
        anyo = sc.nextInt();
        resta = fecha - anyo;
        System.out.println("Tienes " + resta + " años");
    }
}
