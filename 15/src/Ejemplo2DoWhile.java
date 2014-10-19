/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
import java.util.*;
public class Ejemplo2DoWhile {
    public static void main(String[] args) {
	//se define la variable n
        int n;
	//se llama al cosntructor Scanner
        Scanner sc = new Scanner( System.in );
	//a partir de aqui se ejecutan las instrucciones
        do {
	//Pide un numero entre 1 y 10 y lo mete en la variable n
            System.out.print("Escribe un número entre 1 y 10: ");
            n = sc.nextInt();
	//estructura iterativa while, mientras n sea mayor que 1 y menor que 10, mostrara el numero introducido, si no volvera a pedir el numero hasta que se cumpla la condicion
        }while (n<1 || n >10);
        System.out.println("Ha introducido: " + n);
    }
}
