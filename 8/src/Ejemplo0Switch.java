/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;
public class Ejemplo0Switch {
	//de aqui en adelante leera el mensaje
    public static void main(String[] args) {
	//define la variable int
        int mes;
	//usa el constructor scanner y lo recoge en la variable sc
        Scanner sc = new Scanner(System.in);
	//Pide que insertemos un numero y lo introduce en  la variable mes mediante el scanner
        System.out.print("Introduzca un numero de mes: ");
        mes = sc.nextInt();
	//estructura de control para leer un numero y mostrar su resultado
        switch (mes)
        {
		// lee el numero entre 1 y 12 y dara la respuesta correspondiente. despues parara el programa
		// si no esta el numero, mostrara un mensaje y parara el programa.
                case 1: System.out.println("ENERO");
                           break;
                case 2: System.out.println("FEBRERO");
                           break;
                case 3: System.out.println("MARZO");
                           break;
                case 4: System.out.println("ABRIL");
                           break;
                case 5: System.out.println("MAYO");
                           break;
                case 6: System.out.println("JUNIO");
                           break;
                case 7: System.out.println("JULIO");
                           break;
                case 8: System.out.println("AGOSTO");
                           break;
                case 9: System.out.println("SEPTIEMBRE");
                           break;
                case 10: System.out.println("OCTUBRE");
                             break;
                case 11: System.out.println("NOVIEMBRE");
                             break;
                case 12: System.out.println("DICIEMBRE");
                             break;
                default : System.out.println("Mes no válido");                       
        }
    }
}
