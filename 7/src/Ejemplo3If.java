/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*;
public class Ejemplo3If {
	//de aqui en adelante leera el programa
    public static void main(String[] args) {
	//usa el constructor scanner y lo mete en la variable sc
      Scanner sc = new Scanner(System.in);
	//define la variable nota
      double nota;
	//muestra el mensaje y recoge el siguiente numero introducido en la variable nota
      System.out.println("Introduzca una nota entre 0 y 10: ");
      nota = sc.nextDouble();
      System.out.println("La calificación del alumno es ");
	//condicion, si la nota es menor de 0 o mayor de 10, mostrara ese mensaje
      if(nota < 0 || nota > 10)
         System.out.println("Nota no válida");
	//segunda condicion, si el numero es igual a diez, mostrara ese mensaje
      else if(nota==10)
           System.out.println("Matrícula de Honor");
	//tercera condicion, si el numero es mayor o igual a 9 mostrara ese mensaje
      else if (nota >= 9)
           System.out.println("Sobresaliente");
	//cuarta condicion, si el numero es mayor o igual a 7 mostrara ese mensaje
      else if (nota >= 7)
           System.out.println("Notable");
	//quinta condicion, si el numero es mayor o igual a 6 mostrara ese mensaje
      else if (nota >= 6)
           System.out.println("Bien");
	//sexta condicion, si el numero es mayor o igual a 5 mostrara ese mensaje
      else if (nota >= 5)
           System.out.println("Suficiente");
	//si no, mostrara ese mensaje
      else
           System.out.println("Suspenso");
    }
}
