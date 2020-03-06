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
	public void compruebaRectangulo1() {
		assertEquals(12, numero.getNumero1());
	}
	
	@Test
	public void compruebaRectangulo2() {
		assertEquals(6, numero.getNumero2());
	}
	
	@Test
	public void compruebaSuma() {
		assertEquals(18, numero.calcularSuma());
	}
	
	@Test
	public void compruebaResta() {
		assertEquals(6, numero.calcularResta());
	}
	
	@Test
	public void compruebaMultiplicacion() {
		assertEquals(72, numero.calcularMultiplicacion());
	}
}
