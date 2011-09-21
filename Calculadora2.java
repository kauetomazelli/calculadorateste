
public class Calculadora2 {
	public static int somar(int[] valores){
		int somatorio = 0;
		for(int i = 0; i < 3; i++){
			somatorio = somatorio + valores[i];
		}
	return somatorio;
	}

	public static int multiplicar(int[] valores) {
		int produto = 1;
		for(int i = 0; i < 3; i++){
			produto = produto * valores[i];
		}
	return produto;
	}

	public static int divisao(int[] valores) {
		int div = 1;
		for(int i = 0; i < 3; i++){
			div = valores [i] / div;
		}
		return div;
	}

	public static int subtracao(int[] valores) {
		int sub = 0;
		for (int i = 0; i < 3; i++){
			sub = valores [i] - sub;
		}
		return sub;
	}

}
