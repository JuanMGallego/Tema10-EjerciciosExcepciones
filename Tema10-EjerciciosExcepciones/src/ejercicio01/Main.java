package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double numDouble = 0.0;
		int numInt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número de tipo double: ");
		numDouble = Utils.readDouble(sc);
		sc.nextLine();
		System.out.println();
		
		System.out.println(numDouble);
		System.out.println();
		
		System.out.print("Introduzca un número de tipo int: ");
		numInt = Utils.readInt(sc);
		sc.nextLine();
		System.out.println();
		
		System.out.println(numInt);
		System.out.println();
		
		sc.close();

	}

}
