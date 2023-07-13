package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static boolean checkPrime(int a) {
		boolean b = false;
		if (a==2 || a==3) {
			b = true;
		}
		for (int i=2;i<=(a/2);i++) {
			if (a%i == 0) {
				b= false;
				i=a;
			} else {
				b= true;
			}
		}
		 return b;
		}
	
		

}
