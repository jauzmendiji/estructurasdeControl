/*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*;
public class Main {
//de aqui en adelante empieza a leer el programa
    public static void main(String[] args){
	//Define las variables
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
	//pregunta por el primer numero y lo recoge 
        System.out.println("Introduce el primer número:");
        numero1 = sc.nextDouble();
	//pregunta por el segundo numero y lo recoge
        System.out.println("Introduce el segundo número:");
        numero2 = sc.nextDouble();
	//Muestra los numeros, su suma, su resta y su multiplicacion
        System.out.println("Números introducido: " + numero1 + "  " + numero2);
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2));
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);
    }
}
