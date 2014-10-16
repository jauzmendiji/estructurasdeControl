/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo3While {
    public static void main(String[] args) {
	//define las constantes
        final int VALOR_INICIAL = 10;  // limite inf. tabla
        final int VALOR_FINAL = 100;  // limite sup. tabla
        final int PASO = 10 ; // incremento
	//define las variables
        int fahrenheit;
        double celsius;
	//introduce en farenheit el VALOR_INICIAL
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");
	//estructura iterativa, mienstras farenheit sea menor o igual entrara en bucle, hasta que farenheit sea 100
        while (fahrenheit <= VALOR_FINAL ){
		//se calcula el resultado y se introduce en la variable celsius
               celsius = 5*(fahrenheit - 32)/9.0;
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
		//a farenheit le suma la constante paso y vuelve a comenzar
               fahrenheit += PASO;
        }
    }
}
