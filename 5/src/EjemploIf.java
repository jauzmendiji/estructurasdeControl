/*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;
public class EjemploIf {
//de aqui en adelante lee el programa
    public static void main(String[] args) {
	//se usa el constructor scanner y se recoge en una variable
        Scanner sc = new Scanner(System.in);
	//se define la variable num
        int num;      
	//se muestra un mensaje
        System.out.println("Introduzca numero: ");
	//el siguiente numero insertado por teclado se recogera en la variable num
        num = sc.nextInt();
	//condicion, si el numero dividido por dos, su resto es cero, mostrara que es par
        if ((num%2)==0)
           System.out.println("PAR");
	//si no, mostrara que es impar
        else
            System.out.println("IMPAR");
    }
}
