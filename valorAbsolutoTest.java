import static org.junit.Assert.*;
import org.junit.Test;

public class valorAbsolutoTest {	

	@Test
	public void valorAbsolutoComNegativo(){
		int valor = -5;
		int resultado = valorAbsoluto2.abs(valor);
		assertEquals(5,resultado);
	}
	@Test
	public void valorAbsolutoComZero(){
		int valor = 0;
		int resultado = valorAbsoluto2.abs(valor);
		assertEquals(0,resultado);
	}
	@Test
	public void valorAbsolutoComPositivo(){
		int valor = -5;
		int resultado = valorAbsoluto2.abs(valor);
		assertEquals(5,resultado);
	}
}