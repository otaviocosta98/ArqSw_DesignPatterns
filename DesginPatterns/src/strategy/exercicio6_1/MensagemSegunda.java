package strategy.exercicio6_1;

public class MensagemSegunda implements MensagemDoDia {

	@Override
	public void printMessage(String mensagem) {
		System.out.println("SEGUNDA-FEIRA: " + mensagem);
	}

}
