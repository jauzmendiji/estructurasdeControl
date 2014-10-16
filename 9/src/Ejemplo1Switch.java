/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*;
import java.io.*;
public class Ejemplo1Switch {
	//de aqui en adelante lee el programa
	//IOException se usa cuando quieres lanzar un error producido por Entrada o Salida de datos
	//se necesita para poder hacer el read del operador
    public static void main(String[] args) throws IOException{
	//define las variables
        int A,B, Resultado = 0 ;
        char operador;
        boolean calculado = true;
	//usa el constructor scanner y lo mete en una variable
        Scanner sc = new Scanner(System.in);
	//Muestra tres mensajes, pidiendo dos numeros enteros y un operador, cada respuesta la inserta en una variable distinta
        System.out.print("Introduzca un numero entero:");
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");
        B = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/):");
	//lee el operador introducido mediante read y lo convierte a caracter
        operador = (char)System.in.read();
	//estructura de control que lee el operador y realiza la accion
        switch (operador) {
		//si el operador es -, hara la resta, y terminara el programa
                case '-' : Resultado = A - B;
                           break;
		//si el operador es + hara la suma y terminara el programa
                case '+' : Resultado = A + B;
                           break;
		//si el operador es *, hara la multiplicacion y terminara el programa
                case '*' : Resultado = A * B;
                           break;
		// si el operador es / y el segundo numero no es 0, hara la division y cerrara el programa
                case '/' : if(B!=0)
                              Resultado = A / B;
			// en caso de que sea cero, mostrara un mensajey cambiara la variable calculado a falso para no mostrar resultado.
                           else{
                              System.out.println("\nNo se puede dividir por cero");
                              calculado = false;
                           }
                           break;
			//si el operador es diferente a los mostrados, sacara un mensaje y no mostrara resultado pues calculado es falso
                default : System.out.println("\nOperador no valido");
                          calculado = false;
                         
        }
	//condicion, si calculado es true mostrara el resultado.
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
