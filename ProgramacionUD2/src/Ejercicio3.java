public class Ejercicio3 {
	public static void main(String [] args) {
	int a = 0;
	for(int cont = 1; cont<=100; cont++)
		{if(((cont % 3)==0) || ((cont % 2)==0))
		{a++;
		System.out.println("Es múltiplo " +  cont);}	
		}
	System.out.println("El total de numeros multiplos de 2 o 3 es " + a);
}}
