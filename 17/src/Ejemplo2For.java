/*
 * programa que muestra los números del 10 al 1
 */
public class Ejemplo2For {
    public static void main(String[] args) {
	//define la variable i
        int i;
	//Las instrucciones se escriben en el for. i es 10, y mientras sea mayor que 0 restara uno a i. el bucle termina mostrando el valor de i y vuelve a empezar, siendo i, i-1
        for(i=10; i>0;i--)
            System.out.println(i + " ");
    }
}
