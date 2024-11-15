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
		int num1 = getValidInteger(in, "Inserisci il primo numero intero: (premi enter per confermare)");
		System.out.println("Primo numero: " + num1);

		// Leggo e salvo il secondo valore
		int num2 = getValidInteger(in, "Inserisci il secondo numero intero: (premi enter per confermare)");
		System.out.println("Secondo numero: " + num2);

		// Chiudo lo scanner
		in.close();

		System.out.println("Somma: " + sum(num1, num2));
		System.out.println("Sottrazione: " + sub(num1, num2));
		System.out.println("Moltiplicazione: " + mult(num1, num2));
		System.out.println("Divisione: " + div(num1, num2));
		System.out.println("Resto: " + mod(num1, num2));

	}
	
	/* Questo metodo ha il compito di richiedere un imput intero.
	 * Se ciò che viene fornito dall'utente non è di tipo int verrà
	 * richiesto all'infinito di inserire un dato di tipo int. */
	public static int getValidInteger(Scanner in, String prompt) {
		
		String errorMessage = "Input non valido. Per favore, inserisci un numero intero.";
		
		while(true) {
			System.out.println(prompt);
			if (in.hasNextInt()) {
				return in.nextInt();
			} else {
				System.out.println(errorMessage);
				in.next(); // Consuma il token non valido
			}
		}
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
