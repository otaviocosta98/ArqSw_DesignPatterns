package template.method.exercicio7_1;

public class WriterUpper extends Leitora {

	@Override
	public void transformate(String args) {
		System.out.println(args.toUpperCase());
	}

}
