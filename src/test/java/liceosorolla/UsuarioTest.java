package test.java.liceosorolla;
import org.junit.Before;
import org.junit.Test;
import main.java.liceosorolla.Usuario;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class UsuarioTest {
	private Usuario usuario;
	@Before
	public void Before() {
		
		usuario = new Usuario("David", "Fernandez",LocalDate.of(2000,3,25),12);
		
	}
	
	@Test
	public void comprobarNombre() {
		
		assertEquals("David", usuario.getNombre());
		
	}
	
	@Test
	public void comprobarApellidos() {
		
		assertEquals("Fernandez", usuario.getApellidos());
		
	}
	
	@Test
	public void comprobarNombreCompleto() {
		
		assertEquals("David Fernandez", usuario.getNombre()+" "+usuario.getApellidos());
		
	}
	
	@Test
	public void comprobarMayorEdad() {
		
		assertEquals(true,usuario.mayorEdad());
	}
	
	@Test
	public void comprobarIdentificador() {
		
		assertEquals(12,usuario.getIdentificador());
	}
	
	@Test
	public void comprobarNombreMayus() {
		usuario.nombreMayus();
		assertEquals("DAVID",usuario.getNombre());
	}
	
	@Test
	public void comprobarNombreMinus() {
		usuario.nombreMinus();
		assertEquals("david",usuario.getNombre());
	}
	
	



}
