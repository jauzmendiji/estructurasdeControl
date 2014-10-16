/*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;
public class Ejemplo0If {
//de aqui en adelante lee el programa
    public static void main( String[] args ){
	//constructor para llamar a scanner, lo mete en la variable sc
        Scanner sc = new Scanner( System.in );
	//Mensaje que saldra por pantalla
        System.out.print("Nota: ");
	//el proximo numero insertado se recoge en la variable nota
        int nota = sc.nextInt();
	//condicion, si el numero es mayor o igual a 5 se mostrara ese mensaje
        if (nota >= 5 ){
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
        }
	// si no, se mostrara este otro
        else
            System.out.println("Lo Siento, has suspendido");
    }
}
