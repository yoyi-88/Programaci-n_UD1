
package programacion.ut2;


public class ej27 {
    public static void main(String[] args) {
        int multiplicacion;
        
        System.out.println("Este programa escribirá todos los múltiplos de 7 "
                + " menores que 100");
        
        for (int i = 0; i < 15; i++) {
            multiplicacion = 7*i;
            System.out.println("7 * " + i + " = " + multiplicacion);
        }
        
        for (int i = 7; i < 100; i+=7) {
            System.out.println(i);
        }
    }
}
