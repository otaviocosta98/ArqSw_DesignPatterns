package adapter.exercicio_1;

import java.util.HashMap;
import java.util.Map;

public class Run {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("chave1", "valor1");
		map.put("chave2", "valor2");
		map.put("chave3", "valor3");
		map.put("chave4", "valor4");
		map.put("chave5", "valor5");

		MapToMatrizAdapter matriz = new MapToMatrizAdapter(map);
		for (int i = 0; i <= matriz.getMatriz().length - 1; i++) {
			for (int p = 0; p <= matriz.getMatriz()[i].length - 1; p++) {
				System.out.println(matriz.getMatriz()[i][p]);
			}
		}
	}

}
