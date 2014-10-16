/*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;
public class Ejemplo2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	//define las variables
        int n, contador = 0;
	//pide un numero y lo introduce en la variable n
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
	//estructura iterativa, mientras el contador sea menor que n, mostrara un asterisco
        while (contador < n){
               System.out.println(" * ");
		//suma uno a la variable contador
               contador++;
        }
    }
}
