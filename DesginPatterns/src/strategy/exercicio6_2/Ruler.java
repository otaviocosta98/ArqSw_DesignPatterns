package strategy.exercicio6_2;

public class Ruler {
	
	private final Ordenador ordenador;
	
	public Ruler(Ordenador ordenador) {
		this.ordenador = ordenador;
	}

	public void ordena(int[] v) {
		ordenador.ordena(v);
	}

}
