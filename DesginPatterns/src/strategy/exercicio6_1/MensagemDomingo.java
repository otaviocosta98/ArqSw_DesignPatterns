package strategy.exercicio6_1;

public class MensagemDomingo implements MensagemDoDia {

	@Override
	public void printMessage(String mensagem) {
		System.out.println("DOMINGO: " + mensagem);
	}

}
