package template.method.exercicio7_2;
import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		ComparatorTemplateMethod t = new ComparatorTemplateMethod();
		double[] vetor = { 1.1, 2.1, 3.6, 10.5, 0.9 };
		double[] novoVetor = new double[vetor.length];
		for (int i = 0; i < vetor.length-1; i++) {
			novoVetor[i] = t.compare(vetor[i], vetor[i+1]);
		}
		Arrays.sort(novoVetor);
		System.out.println(Arrays.toString(novoVetor));
	}

}
