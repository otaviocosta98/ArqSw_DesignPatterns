package strategy.exercicio6_1;

public class MensagemQuinta implements MensagemDoDia {

	@Override
	public void printMessage(String mensagem) {
		System.out.println("QUINTA-FEIRA: " + mensagem);
	}

}
