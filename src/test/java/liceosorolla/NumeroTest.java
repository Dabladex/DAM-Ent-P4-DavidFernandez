package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorolla.Numero;

public class NumeroTest {
	
	private Numero numero;
	
	@Before
	public void before() {
		numero = new Numero(12,6);
	}
	
	@Test
	public void comprobaRectangulo() {
		assertEquals(false, numero.getNumero1());
	}
}
