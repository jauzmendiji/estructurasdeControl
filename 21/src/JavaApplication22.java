/*
 * Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
 * para valores de x desde 1 hasta XMAX
 */
public class JavaApplication22 {
    public static void main(String[] args) {
	//define las constantes y variables
        final int XMAX = 10;
        int x, n;
        //mostrar la cabecera de la tabla
        System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");
	//le da a x el valor de 1, mientras x sea menor que XMAX, continuara con las columnas, al terminar columnas hara un salto de linea para definir las filas. El bucle terminara sumando 1 a x y volvera a empezar hasta que se cumpla.
        for (x = 1; x <= XMAX; x++){   //filas
	//le da a n el valor de 1, mientras n sea menor o igual a 4, mostrara con un formato definido las potencias de x. el bucle termina sumando uno a n, y volvera a empezar hasta que n sea 4.
             for (n = 1; n <= 4; n++){   //columnas
                  System.out.printf("%10.0f", Math.pow(x,n));
             }
             System.out.println();
        }
    }
}
