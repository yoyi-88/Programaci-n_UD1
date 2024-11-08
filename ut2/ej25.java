package programacion.ut2;

import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado;
        int intento;
        int numeroaciertos = -1;

        System.out.println("Este es un juego de cálculo mental.");
        do{
            int num1 = (int) (Math.random()*100+1);
            int num2 = (int) (Math.random()*100+1);
            resultado = num1 + num2;
            
            System.out.println(num1 + "+" + num2);
            System.out.println("Escribe el intento");
            intento = sc.nextInt();
            
            numeroaciertos++;
        } while (intento == resultado);
        System.out.println("Has fallado");
        System.out.println("Número de intentos: " + numeroaciertos);
    }
}
