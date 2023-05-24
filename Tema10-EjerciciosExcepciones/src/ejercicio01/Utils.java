package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	static double readDouble(Scanner obj) {
		
		double numero;
		
		try {
			
            numero = obj.nextDouble();
            obj.nextLine();
            
        } catch (InputMismatchException doubleError) {
        	
        	System.out.println();
            System.out.println("El valor introducido no es de tipo double");
            numero = 0.0;
            
        }
		
		return numero;
		
	}
	
	static int readInt(Scanner obj) {
		
		int numero;
		
		try {
			
            numero = obj.nextInt();
            obj.nextLine();
            
        } catch (InputMismatchException intError) {
        	
        	System.out.println();
            System.out.println("El valor introducido no es de tipo int");
            numero = 0;
            
        }
		
		return numero;
		
	}
	
}
