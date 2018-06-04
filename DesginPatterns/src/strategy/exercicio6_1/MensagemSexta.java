package strategy.exercicio6_1;

public class MensagemSexta implements MensagemDoDia {

	@Override
	public void printMessage(String mensagem) {
		System.out.println("SEXTA-FEIRA: " + mensagem);
	}

}
