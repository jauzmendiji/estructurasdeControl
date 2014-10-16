 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */
import java.util.*;
public class Ejemplo1OperadorCondicional {
	//de aqui en adelante lee el programa
    public static void main(String[] args) {
	//llama al constructor scanner y lo mete en una variable
        Scanner sc = new Scanner(System.in);
	//define la variable num
        int num;   
	//pide un numero e inserta la respuesta en la variable num   
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();
	//utiliza un operador ternario como condicion, si el numero dividido entre dos, el resultado es cero, mostrara que es par, si no que es impar. ( si es true ,?, sera par, si es false, :, impar)
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
