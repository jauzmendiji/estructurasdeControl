/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo1For {
    public static void main(String[] args) {
	//define las variables y los constantes
        final int VALOR_INICIAL = 10; // limite inf. tabla
        final int VALOR_FINAL = 100; // limite sup. tabla
        final int PASO = 10 ; // incremento
        int fahrenheit;
        double celsius;
	//le  da a la variable farenheit el contenido de la constante
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");
	//mientras farenheit sea menor o igual a VALOR_FINAL, hara los calculos para sacar los celsius correspondientes y los muestra con un estilo definido. Despues suma a farenheit la constante PASO y vuelve a empezar.
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) {
             celsius = 5*(fahrenheit - 32)/9.0;
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}
