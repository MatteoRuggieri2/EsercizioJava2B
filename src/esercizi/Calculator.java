package esercizi;
import java.util.*;

//import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		/* In questo programma prendo 2 interi forniti dall'utente e
		 * eseguo le seguenti operazioni: somma, sottrazione, moltiplicazione
		 * divisione e resto. */

		// Creo input per far inserire 2 numeri interi all'utente
		Scanner in = new Scanner(System.in);

		// Leggo e salvo il primo valore
		System.out.println("Inserisci il primo numero intero: (premi enter per confermare)");
		int num1 = in.nextInt();
		System.out.println("Primo numero: " + num1);

		// Leggo e salvo il secondo valore
		System.out.println("Inserisci il secondo numero intero: (premi enter per confermare)");
		int num2 = in.nextInt();
		System.out.println("Secondo numero: " + num2);

		// Chiudo lo scanner
		in.close();

		System.out.println("Somma: " + sum(num1, num2));
		System.out.println("Sottrazione: " + sub(num1, num2));
		System.out.println("Moltiplicazione: " + mult(num1, num2));
		System.out.println("Divisione: " + div(num1, num2));
		System.out.println("Resto: " + mod(num1, num2));

	}
	

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mult(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}

}
