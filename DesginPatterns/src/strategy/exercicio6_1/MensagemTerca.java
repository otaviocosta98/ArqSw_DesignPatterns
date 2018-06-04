package strategy.exercicio6_1;

public class MensagemTerca implements MensagemDoDia {

	@Override
	public void printMessage(String mensagem) {
		System.out.println("TER�A-FEIRA: " + mensagem);
	}

}
