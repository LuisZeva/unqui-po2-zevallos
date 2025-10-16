package ar.edu.unq.po2.tp4;

import java.time.LocalDate;
public class Ingreso {
	private LocalDate fecha;

	private String concepto;
	private double monto;
	
	


	public Ingreso(LocalDate fecha, String concepto, double monto) {
		this.fecha = fecha;
		this.concepto = concepto;
		this.monto = monto;
		
	}
	
	public double getMonto() {
		return monto;
	}
	
	public double getHorasExtra() {
		return 0;
	}
	
	public double montoSi(boolean condicion) {
		if (condicion) {
			return monto;
		}else {
			return 0;
		}
	}
	
	public boolean esImponible() {
		return this.getHorasExtra() == 0;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public String getConcepto() {
		return concepto;
	}
	

}
