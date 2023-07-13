package Ejercicio10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		int i=0, correcto=0, incorrecto=0;
		
		while(i<5) {
			List<String> valuesList = new ArrayList<String>(englishToSpanish.keySet());
			int randomIndex = new Random().nextInt(valuesList.size());
			String randomValue = valuesList.get(randomIndex);
					
			Scanner palabra = new Scanner(System.in);
			System.out.println("Ingresar la traducción de la palabra " + randomValue + ": ");
			String word = palabra.nextLine();
			
			System.out.println(word);
			
			if(englishToSpanish.containsValue(word)) {
				System.out.println("La respuesta es correcta");
				correcto++;
				
			}
			else {
				System.out.println("La respuesta es incorrecta");
				incorrecto++;
			}
			i++;
			
			palabra.close();
		}
		
		System.out.println("Tuviste " + correcto + " respuestas correctas y " + incorrecto + " respuestas incorrectas");

		
	}

}
