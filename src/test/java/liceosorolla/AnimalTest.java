package src.test.java.liceosorolla;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import src.main.java.liceosorolla.Animal;

public class AnimalTest {
	
	private Animal animal;
	
	
	@Before
	public void Before() {
		
		animal = new Animal ("mamifero","perro",10.6,7,"negro");
	}
	
	@Test
	public void comprobarEspecie() {
		
		assertEquals("mamifero", animal.getEspecie());
		
	}
	
	@Test
	public void comprobarRaza() {
		
		assertEquals("perro", animal.getRaza());
		
	}
	
	@Test
	public void comprobarPeso() {
		
		assertEquals(10,6, animal.getPeso());
		
	}
	
	@Test
	public void comprobarEdad() {
		
		assertEquals(7, animal.getEdad());
		
	}
	@Test
	public void comprobarPelo() {
		
		assertEquals("negro", animal.getPelo());
		
	}

}
