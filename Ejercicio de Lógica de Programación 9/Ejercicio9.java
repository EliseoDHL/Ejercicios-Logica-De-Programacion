package Ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> englishToSpanish = new HashMap<>();
		
		englishToSpanish.put("Hola", "Hello");
		englishToSpanish.put("Cabello", "Hair");
		englishToSpanish.put("Cabeza", "Head");
		englishToSpanish.put("Soltero", "Single");
		englishToSpanish.put("Nariz", "Nose");
		englishToSpanish.put("Papá", "Father");
		englishToSpanish.put("Mamá", "Mother");
		englishToSpanish.put("Grupo", "Group");
		englishToSpanish.put("Perro", "Dog");
		englishToSpanish.put("Entrevista", "Interview");
		englishToSpanish.put("Videojuego", "Videogame");
		englishToSpanish.put("Telefono", "Telephone");
		englishToSpanish.put("Rojo", "Red");
		englishToSpanish.put("Blanco", "White");
		englishToSpanish.put("Motocicleta", "Motorcycle");
		englishToSpanish.put("Interruptor", "Switch");
		englishToSpanish.put("Abeja", "Bee");
		englishToSpanish.put("Perder", "Lose");
		englishToSpanish.put("Carrera", "Race");
		englishToSpanish.put("Maestro", "Teacher");

		Scanner palabra = new Scanner(System.in);
		System.out.println("Ingresar ula palabra que deseas traducir al Inglés: ");
		String word = palabra.nextLine();
		palabra.close();
		
		if(englishToSpanish.containsKey(word)) {
			System.out.println(word + " en inglés es: " + englishToSpanish.get(word));
		}
		else {
			System.out.println("La palabra no se encuentra en el diccionario.");
		}
		
	}

}
