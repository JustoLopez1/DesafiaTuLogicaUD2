import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = sc.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = sc.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = sc.nextDouble();
        
        double[] numeros = {numero1, numero2, numero3};
        Arrays.sort(numeros);
        
        // Orden
        System.out.println("Elija el orden de ordenamiento (ascendente o descendente):");
        String orden = sc.next();

        // imprimimos los resultados
        if (orden.equalsIgnoreCase("ascendente")) {
        	System.out.println("Números ordenados de manera " + orden + ": " + numeros[0]+ " "+ numeros[1]+ " "+ + numeros[2]);
        } else if (orden.equalsIgnoreCase("descendente")) {
        	System.out.println("Números ordenados de manera " + orden + ": " + numeros[2]+ " "+ + numeros[1]+ " "+ + numeros[0]);
            }
         else {
            System.out.println("La opción de orden no es válida. Debe ser 'ascendente' o 'descendente'.");
            System.exit(1);
        }
        sc.close();
    }
}	
