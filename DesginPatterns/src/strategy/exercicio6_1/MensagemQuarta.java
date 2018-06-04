package strategy.exercicio6_1;

public class MensagemQuarta implements MensagemDoDia {

	@Override
	public void printMessage(String mensagem) {
		System.out.println("QUARTA-FEIRA: " + mensagem);
	}

}
