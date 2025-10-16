package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiOperadorTestCase {
	
	MultiOperador multioperador;
	
	@BeforeEach
	
	public void setUp() throws Exception {
		multioperador = new MultiOperador();
		
		multioperador.agregarNumero(7);
		multioperador.agregarNumero(24);
		multioperador.agregarNumero(-22);
		multioperador.agregarNumero(23);
		multioperador.agregarNumero(-5);
	}
	
	
	
	@Test
	public void testSuma() {
		int amount = multioperador.sumarNumeros();
		assertEquals(27, amount);
	}
	
	@Test
	public void testResta() {
		int amount = multioperador.restarNumeros();
		assertEquals(-13, amount);
	}
	
	@Test
	public void testMultiplicacion() {
		int amount = multioperador.multiplicarNumeros();
		assertEquals(425040, amount);
	}
	

}
