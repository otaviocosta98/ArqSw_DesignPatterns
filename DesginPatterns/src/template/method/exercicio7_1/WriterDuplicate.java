package template.method.exercicio7_1;

public class WriterDuplicate extends Leitora {

	@Override
	public void transformate(String args) {
		System.out.println(args+args);
	}

}
