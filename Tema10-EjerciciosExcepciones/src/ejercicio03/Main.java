package ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String fin = "n";
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			Fecha date = new Fecha(0, 0, 0);
			
			try {
				
				System.out.print("Introduzca el día: ");
				date.setDia(sc.nextInt());
				
			} catch (DayOutOfRangeException e) {
				
				System.out.println();
				System.out.println(e.toString());
				System.out.println();
				
			}
			
			try {
				
				System.out.print("Introduzca el mes: ");
				date.setMes(sc.nextInt());
				
			} catch (MonthOutOfRangeException e) {
				
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
