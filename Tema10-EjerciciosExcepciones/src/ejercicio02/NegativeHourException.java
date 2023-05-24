package ejercicio02;

public class NegativeHourException extends Exception{

	@Override
	public String toString() {
		
		return "No se pueden introducir horas negativas";
		
	}
	
}
