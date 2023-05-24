package ejercicio02;

public class NegativeMinuteException extends Exception{

	@Override
	public String toString() {
		
		return "No se pueden introducir minutos negativos";
		
	}
	
}
