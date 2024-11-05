package programacion.ut2;

import java.util.Scanner;
        
public class Ej14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;
        int mediaconversion;
        System.out.println("Escriba la nota del primer trimestre");
        nota1 = sc.nextDouble();
        
        System.out.println("Escriba la nota del segundo trimestre");
        nota2 = sc.nextDouble();
        
        System.out.println("Escriba la nota del tercer trimestre");
        nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Nota boletín: " + media);
        mediaconversion = (int)media;
        System.out.println("Nota Expediente académico: " + mediaconversion);
    }
}
