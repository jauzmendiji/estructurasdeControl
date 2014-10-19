/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
public class Ejemplo3For {
    public static void main(String[] args) {
	//define las variables
        int a, b;
	//le da a las variables el valor de 1. mientras la suma de ambos numeros sea menor a 10, mostrara los dos numeros y la suma. Antes de volver a empezar, a sera a+1 y b, b+2.
        for(a = 1, b = 1; a + b < 10; a++, b+=2){
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}
