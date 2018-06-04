package adapter.exercicio_1;

import java.util.Map;
import java.util.Map.Entry;

public class MapToMatrizAdapter {

	private final Map<String, String> map;
	private String[][] matriz;

	public MapToMatrizAdapter(Map<String, String> map) {
		this.map = map;
		attrMap();
	}

	public String[][] getMatriz() {
		return matriz;
	}

	private void attrMap() {
		int i = 0;
		matriz = new String[2][map.size()];
		for (Entry<String, String> strings : map.entrySet()) {
			matriz[0][i] = strings.getKey();
			matriz[1][i] = strings.getValue();
			i++;
		}
	}

}
