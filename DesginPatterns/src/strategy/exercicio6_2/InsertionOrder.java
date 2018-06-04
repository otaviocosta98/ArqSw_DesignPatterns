package strategy.exercicio6_2;
import java.util.Arrays;

public class InsertionOrder implements Ordenador {

	@Override
	public void ordena(int[] v) {
		int i, j, x;
		for (j = 1; j < v.length; ++j) {
			x = v[j];
			for (i = j - 1; i >= 0 && v[i] > x; --i) {
				v[i + 1] = v[i];
			}
			v[i + 1] = x;
		}
		System.out.println("INSERTION SORT: " + Arrays.toString(v));
	}

}
