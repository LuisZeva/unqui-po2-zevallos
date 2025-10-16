package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;

class PokerStatusTestCase {

	private PokerStatus manoDePoker;
	
	@BeforeEach
	public void setUp() {
		manoDePoker = new PokerStatus();		
	}
	
	@Test
	void testVerificarTrue() {
		
		// Setup
		String dosDePicas = "2P";
		String dosDeCorazones = "2C";
		String dosDeDiamante = "2D";
		String dosDeTreboles = "2T";
		String tresDeTreboles = "3T";
		
		// Exercise
		boolean resultado = manoDePoker.verificar(dosDePicas, dosDeCorazones, dosDeDiamante, dosDeTreboles, tresDeTreboles);
		
		// Verify
		assertTrue(resultado);
		
		// Teardown (no necesario en este caso)
		
	}
	
	@Test
	void testVerificarFalse() {
		
		// Setup
		String dosDePicas = "2P";
		String dosDeCorazones = "2C";
		String dosDeDiamante = "2D";
		String cincoDePicas = "5P";
		String tresDeTreboles = "3T";
		
		// Exercise
		boolean resultado = manoDePoker.verificar(dosDePicas, dosDeCorazones, dosDeDiamante, cincoDePicas, tresDeTreboles);
		
		// Verify
		assertFalse(resultado);
		
		// Teardown (no necesario en este caso)
	}

}
