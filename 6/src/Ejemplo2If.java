/*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;
public class Ejemplo2If {
//de aqui en adelante lee el programa
    public static void main(String[] args) {
	//usa el constructor scanner y lo recoge en la variable sc
      Scanner sc = new Scanner(System.in);
	//define la variable hora
      int hora;
	//muestra este mensaje por pantalla
      System.out.println("Introduzca una hora (un valor entero): ");
	//el siguiente numero insertado por teclado se recogera en la variable hora
      hora = sc.nextInt();
	//condicion, si la hora es mayor o igual a 0 y menor que 12, mostrara Buenos dias
      if (hora >= 0 && hora < 12)
          System.out.println("Buenos días");
	//segunda condicion, si es mayor o igual que 12 y menor que 21, mostrara Buenas tardes
      else if (hora >= 12 && hora < 21)
           System.out.println("Buenas tardes");
	//tercera condicion, si es mayor o igual que 21 y menos que 24, mostrara buenas noches
      else if (hora >= 21 && hora < 24)
            System.out.println("Buenas noches");
	//si no se cumple ninguna de las anteriores, mostrara hora no valida
      else
            System.out.println("Hora no válida");
    }
}
