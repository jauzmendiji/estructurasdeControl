/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*;
public class Ejemplo1While {
    public static void main(String[] args) {
	//defien las variables
        int suma = 0, num;
        Scanner sc = new Scanner(System.in);
	//pide un numero e inserta la respuesta en la variable num
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
	//estructura iterativa, mientras el numero que introduzcas sea mayor o igual a 0, seguira ejecutandose en bucle sumando un numero a otro.
        while (num >= 0){
		//La nueva variable suma sera, el viejo suma mas num
               suma = suma + num;
		//Pedira otra vez un numero y lo insertara en num
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }
	//cuando el num sea menor 0, mostrara la suma de todos los numeros
        System.out.println("La suma es: " + suma );
    }
}
