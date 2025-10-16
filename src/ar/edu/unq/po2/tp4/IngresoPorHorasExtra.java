package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class IngresoPorHorasExtra extends Ingreso{
	private int horasExtra;

	public IngresoPorHorasExtra(LocalDate fecha, String concepto, double monto, int horasExtra) {
		super(fecha, concepto, monto);
		this.horasExtra = horasExtra;
		
	}
	
	@Override 
	public double getHorasExtra() {
		return horasExtra;
	}

}
