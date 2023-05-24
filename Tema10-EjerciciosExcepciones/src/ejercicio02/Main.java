package ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String fin = "n";
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			Hora time = new Hora(0, 0, 0);
			
			try {
				
				System.out.print("Introduzca las horas: ");
				time.setHora(sc.nextInt());
				
			} catch (NegativeHourException e) {
				
				System.out.println();
				System.out.println(e.toString());
				System.out.println();
				
			}
			
			try {
				
				System.out.print("Introduzca los minutos: ");
				time.setMinuto(sc.nextInt());
				
			} catch (NegativeMinuteException e) {
				
				System.out.println();
				System.out.println(e.toString());
				System.out.println();
				
			}
			
			try {
				
				System.out.print("Introduzca las segundos: ");
				time.setSegundo(sc.nextInt());
				
			} catch (NegativeSecondException e) {
				
				System.out.println();
				System.out.println(e.toString());
				System.out.println();
				
			}
			
			System.out.println();
			System.out.print("¿Finalizar? (y/n): ");
			fin = sc.next();
			System.out.println();
			
			
		} while (!fin.equalsIgnoreCase("y"));
		
		sc.close();

	}

}
