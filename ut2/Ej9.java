package programacion.ut2;

import java.util.Scanner;
        
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean lluvia;
        boolean tarea;
        boolean biblioteca;
        System.out.println("Responde con true or false");
        
        System.out.println("No está lloviendo");
        lluvia = sc.nextBoolean();
        
        System.out.println("Has terminado tarea");
        tarea = sc.nextBoolean();
        
        System.out.println("Tienes que ir a la biblioteca");
        biblioteca = sc.nextBoolean();
        
        System.out.println(lluvia && tarea ||  biblioteca);
    }
}
