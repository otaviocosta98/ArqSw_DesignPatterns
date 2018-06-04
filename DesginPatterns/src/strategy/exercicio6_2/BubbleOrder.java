package strategy.exercicio6_2;
import java.util.Arrays;

public class BubbleOrder implements Ordenador {

	@Override
	public void ordena(int[] v) {
		for (int i = v.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j + 1];
					v[j + 1] = v[j];
					v[j] = aux;
				}
			}
		}
		System.out.println("BUBBLE SORT: " + Arrays.toString(v));
	}

}
