package programacion.ut2;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1;
    int n2;
    int MayorMenor;
    
    System.out.println("Este programa solicita dos números y representa"
            + " cual es el mayor");
    System.out.println("Escribir primer número");
    n1 = sc.nextInt();
    System.out.println("Escribir segundo número");
    n2 = sc.nextInt();
    MayorMenor = n1 > n2 ? n1 : n2;
    System.out.println(MayorMenor + " es mayor");   
    }  
}
