package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class MultiOperador {
	
	private List<Integer> numeros;
	
	public MultiOperador() {
		this.numeros = new ArrayList<>();	
	}
	
	public void agregarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public int sumarNumeros() {
		int acumulador = 0;
		for (int numero : this.numeros) {
			acumulador += numero;
		}
		
		return acumulador;
	}
	
	public int restarNumeros() {
		int totalRestadoHastaAhora = numeros.get(0);
		for (int i=1; i< numeros.size(); i++) {
			totalRestadoHastaAhora -= numeros.get(i);
		}
		return totalRestadoHastaAhora;
	}
	
	public int multiplicarNumeros() {
		int acumulador = 1;
		for (int numero : this.numeros) {
			acumulador *= numero;		
		}
		return acumulador;
	}
	
}
