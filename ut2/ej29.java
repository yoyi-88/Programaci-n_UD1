package programacion.ut2;


public class ej29 {
    public static void main(String[] args) {
        System.out.println("Este programa muestra las tablas de multiplicar"
                + " del 1 al 10");
        
        for (int i = 0; i < 11; i++) {
            System.out.println("Tabla del " + i + ":"); 
            
            for (int j = 0; j < 11; j++) {
                int operacion = j*i;
                System.out.println("|" + i + " * " + j + " = " + operacion + "|");
            }
            System.out.println("");
        }
    }
}
