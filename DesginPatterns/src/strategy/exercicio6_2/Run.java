package strategy.exercicio6_2;

public class Run {

	public static void main(String[] args) {
		int v[] = { 10, 0, 55, 71, 17, 5, 2, 99, 102, 60, 1, 77, 22, 5 };
		Ordenador ordenador = new BubbleOrder();
		Ruler ruler = new Ruler(ordenador);
		ruler.ordena(v);

		ordenador = new InsertionOrder();
		ruler = new Ruler(ordenador);
		ruler.ordena(v);

		ordenador = new SelectionOrder();
		ruler = new Ruler(ordenador);
		ruler.ordena(v);

		ordenador = new QuickOrder();
		ruler = new Ruler(ordenador);
		ruler.ordena(v);
	}

}
