package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;


public class Trabajador {
	
	private String nombre;
	private String dni;
	private List<Ingreso> ingresosAnuales;
	
	
	public Trabajador(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.ingresosAnuales = new ArrayList<>();
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosAnuales.add(ingreso);
		
	}
	
	public double getTotalPercibido() {
		double amount = 0;
		for (Ingreso ingreso : ingresosAnuales)	{
			amount += ingreso.getMonto();
		}
		return amount;
	}
	
	public double getMontoImponible() {
		double amount = 0;
		for (Ingreso ingreso : ingresosAnuales) {
			amount += ingreso.montoSi(ingreso.esImponible());
		}
		return amount;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	

	
	
}
