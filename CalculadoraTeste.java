import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTeste {
	@Test
	public void deveSomarUmMaisUm(){
		int resultado = Calculadora.somar(1,1);
		assertEquals(2, resultado);
	}
	@Test
	public void deveSomarDoisMaisDois(){
		int resultado = Calculadora.somar(2,2);
		assertEquals(4, resultado);
	}
	@Test
	public void deveMultiplicarUmVezesUm(){
		int resultado = Calculadora.multiplicar(1,1);
		assertEquals(1, resultado);
	}
	@Test
	public void deveMultiplicarDoisVezesDois(){
		int resultado = Calculadora.multiplicar(2,2);
		assertEquals(4, resultado);
	}
	@Test
	public void deveDividirDoisPorDois(){
		int resultado = Calculadora.dividir(2,2);
		assertEquals(1, resultado);
	}
	@Test
	public void deveDividirDoisPorZero(){
		int resultado = Calculadora.dividir(2,0);
		assertEquals(0, resultado);
	}
}