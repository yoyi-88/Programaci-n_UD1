package programacion.ut2;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int ValorAbsoluto;
        int ternario;
        System.out.println("Escriba un número para realizar su valor absoluto");
        num = sc.nextInt();
        ValorAbsoluto = Math.abs(num);
        System.out.println(ValorAbsoluto);
        
        ternario = num == ValorAbsoluto ? ValorAbsoluto : ValorAbsoluto;
        System.out.println(ternario);
    }
    
}
