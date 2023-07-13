package Ejercicio7;

import java.text.Normalizer;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio7 {
	
	public static boolean validarDia(String dia) {
		String[] dias = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		boolean booleano = false;
		for(int i = 0;i<7;i++) {
			
			if (dia.equals(dias[i])) {
				booleano = true;
				i = 8;
			}else {
				booleano = false;
			}
		}
		return booleano;
		
	}

	public static boolean validarHorario(String horario) {
	    String patron = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
	    return horario.matches(patron);
	}
	
	public static void tiempo(int diasRestantes, LocalTime time) {
		long diasFaltantes = diasRestantes*1440;
		long minutos = ChronoUnit.MINUTES.between(time.with(LocalTime.MIDNIGHT),time);
        long minParaMediaNoche = 1440 - minutos;
        long minViernes = 900;
        long general = minParaMediaNoche+minViernes+diasFaltantes;
        System.out.println("Faltan "+general+" minutos :D");
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean aux = false;
		String diaSinAcentos = "";
		String[] frase;
		do {
			System.out.println("Ingresa día y hora: ");
			String dia = input.nextLine();
			frase = dia.split(" ");
			diaSinAcentos = Normalizer.normalize(frase[0], Normalizer.Form.NFD).replaceAll("\\p{M}", "");
			if (validarDia(diaSinAcentos.toLowerCase())&&validarHorario(frase[1])) {
				aux = true;
			}
			
		}while (!aux);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time = LocalTime.parse(frase[1], formatter);
		LocalTime tiempoViernes = LocalTime.parse("15:00",formatter);
		
		switch (diaSinAcentos.toLowerCase()) {
	    case "lunes":
	    	tiempo(3,time);
	        break;
	    case "martes":
	    	tiempo(2,time);
	        break;
	    case "miercoles":
	    	tiempo(1,time);
	        break;
	    case "jueves":
	        tiempo(0,time);
	        break;
	    case "viernes":
	    	long minutos = ChronoUnit.MINUTES.between(time, tiempoViernes);
	    	System.out.println("Faltan "+minutos+" minutos");
	        break;
	    case "sabado":
	    	tiempo(5,time);
	        break;
	    default:
	    	tiempo(4,time);
	        break;
	}

		input.close();
	}

}
