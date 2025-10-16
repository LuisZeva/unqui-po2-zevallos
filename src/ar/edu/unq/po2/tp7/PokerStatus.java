package ar.edu.unq.po2.tp7;


import java.util.HashMap;
import java.util.Map;

public class PokerStatus {

	public PokerStatus() {
		// TODO Auto-generated constructor stub
	}
	
	public String verificar(String c1, String c2, String c3, String c4, String c5) {
		String[] cartas = { c1, c2, c3, c4, c5 };
	    Map<String, Boolean> jugadas = new HashMap<>();
	    jugadas.put("poquer", this.hayPoquer(cartas));
	    jugadas.put("color", this.hayColor(cartas));
	    jugadas.put("trio", this.hayTrio(cartas));

	    for (var elemento : jugadas.entrySet()) { // en variables locales se puede poner var para abreviar el tipo
	        if (elemento.getValue()) {     
	            return elemento.getKey();
	        }
	    }
	    return "";
	}
	
	public boolean hayPoquer(String[] cartas) {
		Map<String, Integer> valores = new HashMap<>();
		
		for (String carta : cartas) {
			String valor = carta.replaceAll("[PCDT]", ""); // quitamos el palo
			valores.put(valor, valores.getOrDefault(valor, 0) + 1);
		}
		return esPoker(valores);
		
	}
	
	public boolean esPoker(Map<String, Integer> valores) {
		// Si alguna carta aparece 4 veces, hay póquer
		for (int cantidad : valores.values()) {
			if (cantidad == 4) {
				return true;
					}
		}
				return false;
	}
	
	
	
	
	
	
	
	
	
}	
	
	/*public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
		String[] cartas = { c1, c2, c3, c4, c5 };
		Map<String, Integer> valores = new HashMap<>();
		
		for (String carta : cartas) {
			String valor = carta.replaceAll("[PCDT]", ""); // quitamos el palo
			valores.put(valor, valores.getOrDefault(valor, 0) + 1);
		}
		return esPoker(valores);
		
	}
	
	public boolean esPoker(Map<String, Integer> valores) {
		// Si alguna carta aparece 4 veces, hay póquer
		for (int cantidad : valores.values()) {
			if (cantidad == 4) {
				return true;
					}
		}
				return false;
		
	}*/
