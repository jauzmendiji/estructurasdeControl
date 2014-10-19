/*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
import java.util.*;
public class Ejemplo1DoWhile {
    public static void main(String[] args) {
	//se define la variable valor
        int valor;
	//se llama al constructor scanner
        Scanner in = new Scanner( System.in );
	//se ejecutan las instrucciones a partir de do
        do {
	//Pide un numero menor de 100 y se recoge en la variable valor
            System.out.print("Escribe un entero < 100: ");
            valor = in.nextInt();
	//estructura iterativa while, mientras la variable valor sea menor o igual que 100 mostrara el numero introducido, si no, volvera hasta que se cumpla la condicion
        }while (valor >= 100);
        System.out.println("Ha introducido: " + valor);
    }
}
