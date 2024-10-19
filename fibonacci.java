
import java.util.Scanner;

/*
 * Tarea N.1
 * Nombre: Niurka Vanesa Yupanqui
 * Curso: GR3SW
 * Materia: PROGRAMACIÓN II
 * 
 * @etiqueta Este programa identifica si un número ingresado por el usuario, 
 * pertenece a la secuencia de Fibonacci. Si el número 
 * pertenece a la secuencia, se debe mostrar el mensaje 
 * "El número pertenece a la secuencia de Fibonacci", caso 
 * contrario, se debe  mostrar el mensaje "El número no 
 * pertenece a la serie de Fibonacci"
 */

public class fibonacci {
    /*
     * @autor Niurka Vanesa Yupanqui
     * 
     * @version 1.0
     */
    public static void main(String[] args) {

        // Declarar variables
        int numero;
        int a = 0;
        int b = 1;

        // Imprimir y recibir valor por consola
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        numero = scn.nextInt();

        /*
         * @param numero, el número ingresado por el usuario.
         * 
         * @param a, el primer número de la secuencia de Fibonacci.
         * 
         * @param b, el segundo número de la secuencia de Fibonacci.
         * 
         * @return booleano que indica si el número pertenece o no a la
         * secuencia de Fibonacci.
         */
        if (fibonacci(numero, a, b)) {
            System.out.println("El número pertenece a la Secuencia de Fibonacci");
        } else {
            System.out.println("El número no pertenece a la serie de Fibonacci");
        }
        scn.close();
    }

    /*
     * Método que determina si el valor ingresado es una
     * secuenacia de Fibonacci.
     * 
     * @return bolean, retorna una afimacién si el número pertenece a la serie
     * de Fiboncacci.
     */
    public static boolean fibonacci(int numero, int a, int b) {

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int c = a + b;
            a = b;
            b = c;
        }
        return false;

    }

}
