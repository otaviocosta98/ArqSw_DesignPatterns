package template.method.exercicio7_1;

public class WriterLower extends Leitora {

	@Override
	public void transformate(String args) {
		System.out.println(args.toLowerCase());
	}

}
