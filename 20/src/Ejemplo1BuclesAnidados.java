/*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
import java.util.*;
public class Ejemplo1BuclesAnidados {
    public static void main(String[] args) {
	//llama al constructor scanner
        Scanner sc = new Scanner(System.in);
	//define las variables
        int filas, columnas;
        //leer número de filas hasta que sea un número > 0
	//de aqui en adelante se leen las instrucciones
        do{
	//Pide el numero de filas y lo que introducimos va a la variable filas
           System.out.print("Introduce número de filas: ");
           filas = sc.nextInt();
	//estructura iterativa,mientras filas sea menor de uno
        }while(filas<1);
        //leer número de columnas hasta que sea un número > 0
	//de aqui en adelante se leen las instrucciones
        do{
	//Pide el numero de filas y lo inserta en la variable columnas
           System.out.print("Introduce número de columnas: ");
           columnas = sc.nextInt();
	//estructura iterativa,mientras columnas sea menor de uno
        }while(columnas<1);
	//le da a i el valor de 1, mienstras filas sea mayor o igual a i continuara, al terminar las columnas, escribira un salto de linea. sumara uno a i y volerva a empezar hasta que se cumpla.
        for(int i = 1; i<=filas; i++){    //filas
	//le da a j el valor de 1, mienstras columnas sea mayor o igual a j escribira asterisco. sumara uno a j y volerva a empezar hasta que se cumpla.
            for(int j = 1; j<=columnas; j++){   //columnas
                 System.out.print(" * ");
            }
            System.out.println();
        }
       
    }
}
