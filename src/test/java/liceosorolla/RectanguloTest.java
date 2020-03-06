package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import main.java.liceosorolla.Rectangulo;

public class RectanguloTest {
	private Rectangulo rectangulo;
	
	@Before
	public void before() {
		rectangulo = new Rectangulo(6,6);
		}
	
	
	/*@Test
	public void compruebaLados() {
		assertEquals(60,rectangulo.calculaLados());
	}*/
	
	@Test
	public void compruebaPerimetro() {
		assertEquals(24,rectangulo.calculaPerimetro());
	}

	@Test
	public void compruebaArea() {
		assertEquals(36,rectangulo.calculaArea());
	}
	
	@Test
	public void compruebaDiagonal() {
		assertEquals(72,rectangulo.calculaDiagonal());
	}
	
	@Test
	public void compruebaCircuncrita() {
		assertEquals(36,rectangulo.calculaCircuncrita());
	}
	
}
