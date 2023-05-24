package ejercicio02;

import ejercicio02.Hora;

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora() {
		
	}
	
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Hora(Hora h) {
		this.hora = h.hora;
		this.minuto = h.minuto;
		this.segundo = h.segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) throws NegativeHourException{
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else if (hora < 0) {
			throw new NegativeHourException();
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) throws NegativeMinuteException {
		if (minuto >= 0 && minuto <= 60) {
			this.minuto = minuto;
		} else if (minuto < 0) {
			throw new NegativeMinuteException();
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) throws NegativeSecondException {
		if (segundo >= 0 && segundo <= 60) {
			this.segundo = segundo;
		} else if (segundo < 0) {
			throw new NegativeSecondException();
		}
		
	}
	
}
