import java.util.Scanner;

public class Ejercicio2 {
public static void main(String [] args) {
int a = -1;
Scanner sc = new Scanner(System.in);
while(a<=0) {
	System.out.print("Introduce un numero positivo");
	a = sc.nextInt();}
for(int contador = a+1; contador <= a+20; contador++) {
	System.out.println(contador);
}
sc.close();
}}
