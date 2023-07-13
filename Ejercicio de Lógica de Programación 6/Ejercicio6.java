package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa una frase:");
		
		String frase = input.nextLine();
		char[] letras = new char[frase.length()];
		char[] invertirLetras = new char[frase.length()];


		for (int i = 0; i < frase.length(); i++) {
		    letras[i] = frase.charAt(i);
		    invertirLetras[frase.length()-i-1]=letras[i];
		}

		String cadenaInvertida = new String(invertirLetras);
		System.out.println(cadenaInvertida);

		input.close();
	}
}
