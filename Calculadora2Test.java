import static org.junit.Assert.*;
import org.junit.Test;

public class Calculadora2Test {
	@Test
	public void deveSomarListaDeValores(){
		int [] valores = {1,2,6};
		int resultado = Calculadora2.somar(valores);
		assertEquals(9,resultado);
	}
	@Test
	public void deveSubtrairListaDeValores(){
		int [] valores = {5,10,6};
		int resultado = Calculadora2.subtracao(valores);
		assertEquals(1,resultado);
	}
	@Test
	public void deveMultiplicarListaDeValores(){
		int [] valores = {1,2,6};
		int resultado = Calculadora2.multiplicar(valores);
		assertEquals(12,resultado);
	}
	@Test
	public void deveDividirListaDeValores(){
		int [] valores = {5,10,2};
		int resultado = Calculadora2.divisao(valores);
		assertEquals(1,resultado);
	}
}
