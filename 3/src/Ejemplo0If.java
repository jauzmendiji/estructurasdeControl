/*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
import java.util.*;
public class Ejemplo0If {
//de aqui en adelante lee el programa
    public static void main( String[] args ){
	//usa el constructor escaner y lo mete en una variable
        Scanner sc = new Scanner( System.in );
	//Lo que aparece en pantalla pidiendo un numero
        System.out.print("Nota: ");
	//el numero insertado se recoge en una variable
        int nota = sc.nextInt();
	//condicion, si el numero es mayor de 5 mostrara lo escrito en pantalla
        if (nota >= 5 ){
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
        }
    }
}
