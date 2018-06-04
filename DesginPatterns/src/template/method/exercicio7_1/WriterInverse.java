package template.method.exercicio7_1;

public class WriterInverse extends Leitora {

	@Override
	public void transformate(String args) {
		String inverse = "";
		for (int i = args.length() - 1; i >= 0; i--) {
			inverse += args.charAt(i);
		}
		System.out.println(inverse);
	}

}
