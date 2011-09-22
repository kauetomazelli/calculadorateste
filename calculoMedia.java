import static org.junit.Assert.*;
import org.junit.Test;

public class calculoMedia {
	@Test
	public void deveSomarListaDeValores(){
		int [] valores = {7,7,7,7};
		int resultado = media2.media(valores);
		assertEquals(7,resultado);
	}	
}
