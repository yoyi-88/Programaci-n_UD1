package programacion.ut2;

public class Ej13 {
    public static void main(String[] args) {
     boolean a = 10 + 5 * 2 > 20 && 4 == 4; /* False , porque 20 no es mayor
     que 20 y 4 es igual a 4 true + false = false*/
     boolean b = !(7 + 3 > 10) || 3*2 <=6; /* True, ya que se cumple la
     //condición de || */
     boolean c = 10 / 2 + 3 * 5 == 19 && true; /*False, ya que 20 no es igual
     //a 19 y false + true = false*/
     int x = 5; x += 3 * 2;// El resultado es 16
     boolean d = false; d = !d || 7 % 2 == 1; /*True, ya que las dos condiciones 
     //son falsas*/
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        System.out.println(d);
    }
    
}
